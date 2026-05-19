package org.example;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// ─── 1. A interface e o "bean real" ───────────────────────────────────────────

interface EmailService {
    Future<String> enviarEmail(String destinatario);
}

class EmailServiceImpl implements EmailService {

    @Override
    public Future<String> enviarEmail(String destinatario) {
        // Aqui dentro voce esta na worker thread o metodo já foi
        // despachado pelo proxy. Simula trabalho demorado.
        System.out.println("[" + Thread.currentThread().getName() + "] Enviando email para " + destinatario);
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        return CompletableFuture.completedFuture("Enviado para " + destinatario);
    }
}


// ─── 2. O proxy dinâmico — equivalente ao AsyncAnnotationAdvisor ──────────────

class AsyncProxy implements InvocationHandler {

    private final Object targetBean;          // o bean real
    private final ExecutorService executor;   // equivalente ao ThreadPoolTaskExecutor

    public AsyncProxy(Object targetBean, ExecutorService executor) {
        this.targetBean = targetBean;
        this.executor = executor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("[" + Thread.currentThread().getName() + "] Proxy interceptou: " + method.getName());

        // Empacota a chamada real numa Callable e submete ao pool —
        // exatamente o que o AsyncExecutionInterceptor faz.
        CompletableFuture<Object> completableFuture = new CompletableFuture<>();

        executor.submit(() -> {
            try {
                Object result = method.invoke(targetBean, args);
                // Se o bean já devolveu um Future, resolve com o valor interno
                if (result instanceof final Future<?> future) {
                    completableFuture.complete(future.get());
                } else {
                    completableFuture.complete(result);
                }
            } catch (Exception e) {
                completableFuture.completeExceptionally(e);
            }
        });

        // Retorna imediatamente ao caller — thread principal não bloqueia
        return completableFuture;
    }
}


// ─── 3. A "fábrica de contexto" — equivalente ao ApplicationContext ───────────

class AsyncContext {

    public static <T> T createProxy(Class<T> iface, T bean, ExecutorService executor) {
        return iface.cast(
                Proxy.newProxyInstance(
                        iface.getClassLoader(),
                        new Class<?>[]{ iface },
                        new AsyncProxy(bean, executor)
                )
        );
    }
}


// ─── 4. O caller — como qualquer @Service que injeta o EmailService ───────────

public class Main {

    public static void main(String[] args) throws Exception {

        // Equivalente ao @Bean ThreadPoolTaskExecutor do Spring
        ExecutorService executor = Executors.newFixedThreadPool(
                4,
                r -> new Thread(r, "async-worker-" + System.nanoTime())
        );

        // O Spring faz isso nos bastidores na inicialização do contexto
        EmailService emailService = AsyncContext.createProxy(
                EmailService.class,
                new EmailServiceImpl(),
                executor
        );

        // ── Chamada 1 ────────────────────────────────────────────────────────
        System.out.println("[" + Thread.currentThread().getName() + "] Chamando enviarEmail — não vai bloquear");

        @SuppressWarnings("unchecked")
        CompletableFuture<String> f1 = (CompletableFuture<String>) emailService.enviarEmail("alice@exemplo.com");

        System.out.println("[" + Thread.currentThread().getName() + "] Caller continua executando enquanto email é enviado...");

        // ── Chamada 2 — dispara em paralelo ──────────────────────────────────
        @SuppressWarnings("unchecked")
        CompletableFuture<String> f2 = (CompletableFuture<String>) emailService.enviarEmail("bob@exemplo.com");

        // Aguarda os dois (opcional — equivale ao .get() num @Async com Future)
        System.out.println("Resultado 1: " + f1.get());
        System.out.println("Resultado 2: " + f2.get());

        executor.shutdown();
    }
}

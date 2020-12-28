package edu.br.impacta.async;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Async {

    //private static final ExecutorService executor = Executors.newSingleThreadExecutor();
    //private static final ExecutorService executor = Executors.newFixedThreadPool(2);
    private static final ExecutorService executor = Executors.newWorkStealingPool(4);

    private static Future<List<String>> getNamesAsync(String from) {
        var names = List.of("words", "of", "the", "list");
        var result = new ArrayList<String>();

        return executor.submit(() -> {
            for(var name : names) {
                try {
                    result.add(name);
                    System.out.println(String.format("in the loop for %s", from));
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("deu ruim...");
                    e.printStackTrace();
                }
            }

            return result;
        });
    }

    public static void playAsync() {
        var localDate = LocalDateTime.now();
        System.out.println("playing async!!!");
        System.out.println(localDate);

        var asyncResult = getNamesAsync("first sample");
        System.out.println("I dont care ...");
        System.out.println(LocalDateTime.now());

        try {
            var realResult = asyncResult.get();
            realResult.forEach(System.out::println);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

}

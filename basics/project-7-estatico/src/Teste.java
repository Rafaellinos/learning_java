
import dogs.Cachorro;

public class Teste {

    public static void main(String[] args) {
        Cachorro.qtdCaudas = 1; // atributo estático, consigo acessa diretamente
        System.out.println(Cachorro.qtdCaudas);

        Cachorro c = new Cachorro();
        c.cor = "Azul";
        System.out.println(c.cor);
    }
}
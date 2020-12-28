package edu.br.impacta.basic;

public class Types {
    public static void variaveis() {
        System.out.println("iniciando o trabalho com variaveis");
        String name = "emilio murta resende";
        int idade = 40;
        double altura = 1.78;
        double peso = 90;
        Integer idadeOuNulo = null;

        if (idade % 2 != 0) idade = 0;

        if (idadeOuNulo == null) idadeOuNulo = idade;

        System.out.printf("%s %d %.2f %.2f %d %n", name, idade, altura, peso, idadeOuNulo);
    }
}

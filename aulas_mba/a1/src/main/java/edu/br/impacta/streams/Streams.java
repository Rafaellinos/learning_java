package edu.br.impacta.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void playStreams() {
        System.out.println("!!!! Playing with Streams !!!!");

        List.of("oNe", "Two", "thrEe")
                .stream()
                .map(x -> {
                    System.out.println("processando o mapa");
                    return x.toUpperCase();
                })
                .forEach(System.out::println);

        List.of("oNe", "Two", "thrEe")
                .parallelStream()
                .map(x -> {
                    System.out.println("processando o mapa com collectors");
                    return x.toUpperCase();
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

package edu.br.impacta.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.Collection;


public class ExercicioZero {
    private static final ExecutorService executor = Executors.newWorkStealingPool(4);

    private static Integer getRandomNumber(){
        return (int) (Math.random() * 100);
    }

    private static Future<List<Integer>> getRandomList(Integer arraySize) {

        List<Integer> numbers = new ArrayList<Integer>();
        return executor.submit(() -> {
            for (int i = arraySize; i > 0; i --){
                var randomNumber = getRandomNumber();
                while (numbers.contains(randomNumber)) {
                    randomNumber = getRandomNumber();
                }
                Thread.sleep(500);
                numbers.add(randomNumber);
            }
            return numbers;
        });
    }

    private static List<List<Integer>> getListOfLists(Integer matrixX, Integer matrixY) {

        List<List<Integer>> listOfLists = new ArrayList<>();
        for (int i = 0; i < matrixY; i++) {
            var asyncResult = getRandomList(matrixX);
            try {
                var realResult = asyncResult.get();
                listOfLists.add(realResult);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        return listOfLists;
    }

    public static void main( String[] args ) {
        var result = getListOfLists(5, 5);
        System.out.println(result);
        var finalRestul = result
                .stream()
                .collect(Collectors.flatMapping(
                        Collection::stream,
                        Collectors.toList()));

        System.out.println(finalRestul);

    }

}

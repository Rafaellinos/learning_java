package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] sortIntegers (int[] intArrays) {
        /*
            Como funciona:
                array ex: 444, 150, 1, 0, 1111
                Primeira iteração:
                    444, 150, 1, 1111, 0 -> Flag true | Pq array[3](0) < array[4](1111)
                 Segunda iteração:
                    444, 150, 1111, 1, 0 -> Flag true | Pq array[2](1) < array[3](1111)
                 Terceira iteração:
                    444, 1111, 150, 1, 0 -> Flag true | Pq array[1](150) < array[2](1111)
                 Quarta iteração:
                    1111, 444, 150, 1, 0 -> Flag true | Pq array[0](444) < array[1](1111)
                 Quinta iteração:
                    Flag false, não há nenhum elemento menor que o seguinte.
                 Sai da iteração.
         */
        int[] sortedValues = Arrays.copyOf(intArrays, intArrays.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedValues.length - 1; i++) {
                if (sortedValues[i] < sortedValues[i+1]) {
                    temp = sortedValues[i];
                    sortedValues[i] = sortedValues[i+1];
                    sortedValues[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedValues;
    }

    public static void main(String[] args) {
	    int[] myIntegers = getIntegers(5);
	    printArray(myIntegers);
        int[] sorted = sortIntegers(myIntegers);
        System.out.println("___________");
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        for(int i = 0; i < array.length; i ++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}

package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    private static void reverse(int[] array) {
        /*
            Como funciona:
                ex: [1,3,4]
                O maxIndex é o len(array) - 1, pq sempre começa no 0
                O halfLength == 1 (3/2 == 1, arredondado)

                    Na primeira iteração:
                        int temp = array[0] // 1
                        array[0] = array[2 - 0] // 4
                        array[2-0] = temp
                    Sem mais iteração, pois o halfLength é um
                    Resultado: [4, 3, 1]
         */
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        System.out.println(halfLength);
        for (int i=0; i<halfLength; i++) {
            int tmp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = tmp;
        }
    }

    public static void main(String[] args) {
	    int[] myInt = {1,3,4};
	    int[] copy = Arrays.copyOf(myInt, myInt.length);
        System.out.println(Arrays.toString(myInt));
	    reverse(myInt);
        System.out.println(Arrays.toString(myInt));

    }
}

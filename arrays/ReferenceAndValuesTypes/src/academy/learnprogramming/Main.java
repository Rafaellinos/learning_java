package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue; // value type, just pass the value

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        int[] myIntArray = new int[3];
        int[] myIntArray1 = myIntArray;

        myIntArray[2] = 10;
        myIntArray1[0] = 777;
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myIntArray1));
        // reference type, same object
        // 2 reference pointing to the same address in memory
        // in other words, they r the same


    }
}

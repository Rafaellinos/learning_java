package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //wrapper class
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        /*
        out :
            Integer minimum value = -2147483648
            Integer maximum value = 2147483647
         */
        System.out.println("Integer minimum value = " + (myMinIntValue + 1)); //overflow
        System.out.println("Integer minimum value = " + (myMaxIntValue - 1)); //underflow
        /*
            Overflow: quando o java tenta encaixar algo que não cabe
         */
        int JavaMaxIntNumber = 2_147_483_647; // igual ao pythonsse, 32bits

        byte myMinByteValue = Byte.MIN_VALUE; // 8 bits
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; // 16 bits
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long MyLongValue = 100L; // L ou l para dizer que é grande
        System.out.println(MyLongValue);

        long myMinLongValue = Long.MIN_VALUE; // 16 bits
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println(myMinLongValue); // 64 bits
        System.out.println(myMaxLongValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        System.out.println(myNewByteValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longValue = 5000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longValue);


    }
}

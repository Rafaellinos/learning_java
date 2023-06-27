package com.randomtests;


import java.util.Arrays;

class Main {

    static boolean exists(int[] ints, Integer k) {
        return Arrays.stream(ints).anyMatch(k::equals);
    }


    public static void main(String[] args) {
        System.out.println("Hello Worldasdas!");
        main(args);
        System.out.println(exists(new int[]{1,2,3,12}, 12));
    }
}
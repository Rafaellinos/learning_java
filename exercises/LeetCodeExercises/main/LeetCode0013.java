package main;

import java.util.HashMap;

public class LeetCode0013 {

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1_000);

        int intNumber = 0;
        for (char romanL: s.toCharArray()) {
            intNumber += romanToInt.get(romanL);
        }

        return intNumber;
    }
}

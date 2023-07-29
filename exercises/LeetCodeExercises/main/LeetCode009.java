package main;

import java.lang.Integer;

public class LeetCode009 {

    public boolean isPalindrome(int x) {
        String intString = Integer.toString(x);
        StringBuilder reversedString = new StringBuilder();
        char[] charArray = intString.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString.append(charArray[i]);
        }
        return reversedString.toString().equals(intString);
    }

}

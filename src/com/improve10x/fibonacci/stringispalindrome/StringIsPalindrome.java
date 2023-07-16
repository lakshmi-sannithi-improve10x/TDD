package com.improve10x.fibonacci.stringispalindrome;

public class StringIsPalindrome {

    public static boolean findPalindrome(String word) {
        String reverse = "";
        String trimWord = word.trim();
        for (int i = trimWord.length() - 1; i >= 0; i--) {
            reverse += trimWord.charAt(i);
        }
        if (trimWord.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}

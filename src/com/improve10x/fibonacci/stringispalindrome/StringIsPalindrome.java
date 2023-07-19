package com.improve10x.fibonacci.stringispalindrome;

public class StringIsPalindrome {

    public  boolean findPalindrome(String word) {
        String reverse = "";
        String trimWord = word.trim();
        for (int i = trimWord.length() - 1; i >= 0; i--) {
            reverse += trimWord.charAt(i);
        }
        if (trimWord == null){
            return false;
        } else if (trimWord == "") {
            return true;
        }else if (trimWord.equals(reverse)) {
            return true;
        }
        return false;
    }
}

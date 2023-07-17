package com.improve10x.fibonacci.swappingtwostrings;

public class SwappingTwoStrings {
    public String swapStrings(String str1, String str2) {
        str1 = str1 + str2;
        str2 = str1.substring(0,(str1.length() - str2.length()));
        str1 = str1.substring(str2.length());
        System.out.println("AfterSwapping:" + str1 + ","+str2);
        return str1 + str2;
    }
}

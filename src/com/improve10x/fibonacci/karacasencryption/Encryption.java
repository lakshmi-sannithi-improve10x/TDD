package com.improve10x.fibonacci.karacasencryption;

public class Encryption {
    public String encrypt(String word) {
        if (word == null || word.isEmpty()){
            return "aca";
        }if (word.equals("a")){
            word = "0";
        } else if (word.equals("e")) {
            word = "1";
        } else if (word.equals("i")) {
           word = "2";
        } else if (word.equals("o")) {
           word = "3";
        } else if (word.equals("u")) {
            word = "4";
        }
        return word + "aca";
    }
}

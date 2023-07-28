package com.improve10x.fibonacci.returnssomethingtome;

public class Something {
    public String findWord(String word) {
        if (word == null || word.isEmpty()) {
            return "Something";
        }
        return "Something " + word;
    }
}

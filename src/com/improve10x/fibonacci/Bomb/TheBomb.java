package com.improve10x.fibonacci.Bomb;

public class TheBomb {
    public String CheckWord(String name) {
        String result = "";
        String textInLowerCase;
        textInLowerCase = name.toLowerCase();
        if (textInLowerCase.contains("null")){
            result = "null";
        } else if (textInLowerCase.contains("")) {
           result = "empty";
        } else if (textInLowerCase.contains("bomb")) {
            result = "DUCK!";
        } else {
            result = "Relax, there's no bomb.";
        }
        return result;
    }
}

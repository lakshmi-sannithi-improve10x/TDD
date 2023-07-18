package com.improve10x.fibonacci.Bomb;

public class TheBomb {
    public String CheckWord(String name) {
        String result = "";
        if (name == "null") {
            return null;
        }
        String textInLowerCase = name.toLowerCase();
        if (textInLowerCase == "") {
            return "";
        }
        if (textInLowerCase.contains("bomb")) {
            result = "DUCK!";
        } else {
            result = "Relax, there's no bomb.";
        }
        return result;
    }
}

package com.improve10x.fibonacci.namegreeting;

public class Greeting {
    public String setNameGreeting(String name) {
        String nameGreeting = "";
        if (name == "null") {
            return null;
        } else if (name == "") {
            return "empty";
        } else {
            nameGreeting = "hello" + " " + name + "!";
            return nameGreeting;
        }
    }
}



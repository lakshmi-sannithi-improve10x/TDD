package com.improve10x.fibonacci.agetodays;

public class AgeToDays {
    public int convertAgeToDays(int age) {
        int result = -1;
        if (age == 0){
            result = 0;
        } else if (age > 0) {
            result = age * 365;
        }
        return result;
    }
}

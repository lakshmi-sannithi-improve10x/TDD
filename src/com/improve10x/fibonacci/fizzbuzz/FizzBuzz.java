package com.improve10x.fibonacci.fizzbuzz;

public class FizzBuzz {

    public String findFizzBuzz(int n) {
        String result = "";
        int number = n;
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(number);
        }
        return result;
    }

}
package com.improve10x.fibonacci.factorial;

public class Factorial {

    public static int findFactorial(int num) {
        int factorial = 1;
        if (num < 0){
            return  -1;
        } else if (num > 0) {
            for(int i = 1; i <=num; i++){
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}


package com.improve10x.fibonacci.existanumberhigher;

public class HigherNumber {

    public boolean findHighNumber(int[] numbers, int n) {
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if (n <= numbers[i]) {
                result = true;
                break;
            }
        }
        return result;
    }
}

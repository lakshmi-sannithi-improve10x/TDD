package com.improve10x.fibonacci.sumofallarrayelements;

public class SumOfArray {
    public int findSum(int[] numbers) {
        int result = numbers[0] + numbers[1] + numbers[2];
        if (result < 0) {
            return -1;
        }
        return result;
    }
}

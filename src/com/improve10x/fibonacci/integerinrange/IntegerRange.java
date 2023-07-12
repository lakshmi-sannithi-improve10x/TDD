package com.improve10x.fibonacci.integerinrange;

public class IntegerRange {
    public boolean findRange(int a, int n, int b) {
        boolean result = false;
        if (n >= a && n < b) {
            result = true;
        }
        return result;
    }
}

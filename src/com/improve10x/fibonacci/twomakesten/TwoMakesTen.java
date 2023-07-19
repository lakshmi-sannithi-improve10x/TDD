package com.improve10x.fibonacci.twomakesten;

public class TwoMakesTen {
    public boolean makesTen(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10 || a + b == 10) {
            result = true;
        }
        return result;
    }
}

package com.improve10x.fibonacci.powercalculator;

public class PowerCalculator {
    public int findPower(int v, int c) {
        int power = v * c;
        if (v<0 && c<0){
            return -1;
        }else {
            return power;
        }
    }
}

package com.improve10x.fibonacci.minutestoseconds;

public class MinutesToSeconds {
    public int findSeconds(int t) {
        int result = 0;
        if (t<0){
            result = -1;
        } else if (t>0) {
            result = t * 60;
        }
        return result;
    }
}

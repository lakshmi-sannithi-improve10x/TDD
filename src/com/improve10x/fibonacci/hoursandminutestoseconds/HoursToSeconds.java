package com.improve10x.fibonacci.hoursandminutestoseconds;

public class HoursToSeconds {
    public int findSeconds(int x, int y) {
        int result = 0;
        int hoursAndMinutes = x + y;
        if (hoursAndMinutes<0){
            result = -1;
        } else if (hoursAndMinutes>0) {
            result = x * 60 * 60 + y * 60;
        }
        return result;
    }
}

package com.improve10x.fibonacci;

public class Fibonacci {
    public int find(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
           return find(n-1) + find(n -2);
           /* fibonacci series-0,1,1,2,3,5,8--
           input =             0,1,2,3,4,5,6
           5-1 =4,3
           5-2=3,2
            */
        }
    }
}

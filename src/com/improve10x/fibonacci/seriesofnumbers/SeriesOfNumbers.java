package com.improve10x.fibonacci.seriesofnumbers;

public class SeriesOfNumbers {

    public static void main(String[] args) {
        int answer = findNumber(1);
        System.out.println(answer);
    }
    public static int findNumber(int n) {
        if (n<=0){
          return 0;
      }else {
          System.out.print(n + "");
          int result = n-1;
          return result;
        }

    }
}

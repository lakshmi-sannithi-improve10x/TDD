package com.improve10x.fibonacci.add;

public class Add {
    public static void main(String[] args) {
        Add add = new Add();
        boolean answer = add.sumIsLessThan100(5,5);
        System.out.println(answer);
    }
    public boolean sumIsLessThan100(int i, int i1) {
        if (i + i1<100){
            return true;
        }
        return false;
    }
}

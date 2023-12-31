package com.improve10x.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing(){

    }
    /* fibonacci series-0,1,1,2,3,5---
    input n=-10,output = -1
    input n= 0, output= 0
    input n= 1, output= 0
    input n= 2, output= 1
     */
    @Test
    public  void giveAnyNegativeNumber_returnNegativeOne(){
       Fibonacci fibonacci = new Fibonacci();
      int negativeFibonacci= fibonacci.find(-10);
        assertEquals(-1,negativeFibonacci);
    }

    @Test
    public void givenZero_returnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.find(0);
        assertEquals(0,firstFibonacci);
    }

    @Test
    public void givenOne_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.find(1);
        assertEquals(1,secondFibonacci);
    }

    @Test
    public void givenTwo_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int thirdFibonacci = fibonacci.find(2);
        assertEquals(1,thirdFibonacci);
    }

    @Test
    public void givenFive_returnFive(){
        Fibonacci fibonacci = new Fibonacci();
        int fourthFibonacci = fibonacci.find(5);
        assertEquals(5,fourthFibonacci);
    }
}

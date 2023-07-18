package com.improve10x.fibonacci.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenMinusTen_returnMinusOne(){
        Factorial factorial = new  Factorial();
        int one = factorial.findFactorial(-10);
        assertEquals(-1,one);
    }

    @Test
    public void givenMinusOne_returnMinusOne(){
        Factorial factorial = new  Factorial();
        int one = factorial.findFactorial(-1);
        assertEquals(-1,one);
    }

    @Test
    public void givenOne_returnOne(){
        Factorial factorial = new  Factorial();
        int one = factorial.findFactorial(1);
        assertEquals(1,one);
    }

    @Test
    public void givenTwo_returnTwo(){
        Factorial factorial = new  Factorial();
        int one = factorial.findFactorial(2);
        assertEquals(2,one);
    }

    @Test
    public void given3_return12(){
        Factorial factorial = new  Factorial();
        int one = factorial.findFactorial(3);
        assertEquals(6,one);
    }

    @Test
    public void given4_return24(){
        Factorial factorial = new  Factorial();
        int one = factorial.findFactorial(4);
        assertEquals(24,one);
    }

    @Test
    public void given5_return120(){
        Factorial factorial = new  Factorial();
        int one = factorial.findFactorial(5);
        assertEquals(120,one);
    }
}

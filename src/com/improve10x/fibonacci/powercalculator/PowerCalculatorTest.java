package com.improve10x.fibonacci.powercalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerCalculatorTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenZero_returnZero(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = powerCalculator.findPower(0,0);
        assertEquals(0,number) ;
    }

    @Test
    public void givenNegativeOne_returnNegativeOne(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = powerCalculator.findPower(-1,-1);
        assertEquals(-1,number) ;
    }

    @Test
    public void givenMinusTwoAndMinusTwo_returnNegativeOne(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = powerCalculator.findPower(-2,-2);
        assertEquals(-1,number) ;
    }

    @Test
    public void givenOneAndZero_returnZero(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = powerCalculator.findPower(1,0);
        assertEquals(0,number);
    }

    @Test
    public void givenZeroAndOne_returnNegativeOne(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int zero = powerCalculator.findPower(0,1);
        assertEquals(0,zero) ;
    }

    @Test
    public void given20And480_return9600(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int zero = powerCalculator.findPower(20,480);
        assertEquals(9600,zero) ;
    }

    @Test
    public void given3And110_return330(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int zero = powerCalculator.findPower(3,110);
        assertEquals(330,zero) ;
    }

    @Test
    public void given230And10_returnNegativeOne(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int zero = powerCalculator.findPower(230,10);
        assertEquals(2300,zero) ;
    }
}

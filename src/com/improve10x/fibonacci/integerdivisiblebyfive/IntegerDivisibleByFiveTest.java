package com.improve10x.fibonacci.integerdivisiblebyfive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerDivisibleByFiveTest {
    private IntegerDivisibleByFive integerDivisibleByFive;

    @BeforeEach
    public void setup() {
        integerDivisibleByFive = new IntegerDivisibleByFive();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenZero_returnTrue() {
        boolean zero = integerDivisibleByFive.find(0);
        assertEquals(true, zero);
    }

    @Test
    public void givenMinusOne_returnFalse() {
        boolean minusOne = integerDivisibleByFive.find(-1);
        assertEquals(false, minusOne);
    }

    @Test
    public void givenFive_returnTrue() {
        boolean five = integerDivisibleByFive.find(5);
        assertEquals(true,five);
    }

    @Test
    public void givenMinusFiftyFive_returnTrue(){
        boolean minusFiftyFive = integerDivisibleByFive.find(-55);
        assertEquals(true,minusFiftyFive);
    }

    @Test
    public void givenThirtySeven_returnFalse(){
        boolean thirtySeven = integerDivisibleByFive.find(37);
        assertEquals(false,thirtySeven);
    }

}

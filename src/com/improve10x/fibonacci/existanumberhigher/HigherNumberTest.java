package com.improve10x.fibonacci.existanumberhigher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HigherNumberTest {
    private HigherNumber higherNumber;

    @BeforeEach
    public void setup() {
        higherNumber = new HigherNumber();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenZeros_returnTrue() {
        boolean zero = higherNumber.findHighNumber(new int[]{0, 0, 0, 0, 0}, 0);
        assertEquals(true, zero);
    }

    @Test
    public void givenMinusOne_returnTrue() {
        boolean zero = higherNumber.findHighNumber(new int[]{-1, -1, -1, -1, -1}, -1);
        assertEquals(true, zero);
    }

    @Test
    public void givenOnes_returnTrue() {
        boolean zero = higherNumber.findHighNumber(new int[]{1, 1, 1, 1, 1}, 1);
        assertEquals(true, zero);
    }

    @Test
    public void givenArray_returnFalse() {
        boolean zero = higherNumber.findHighNumber(new int[]{1, 2, 3, 4, 5}, 8);
        assertEquals(false, zero);
    }

    @Test
    public void givenArray_returnTrue() {
        boolean zero = higherNumber.findHighNumber(new int[]{5, 3, 15, 22, 4}, 10);
        assertEquals(true, zero);
    }

    @Test
    public void givenNumbersArray_returnTrue() {
        boolean zero = higherNumber.findHighNumber(new int[]{4, 3, 3, 3, 2, 2, 2}, 4);
        assertEquals(true, zero);
    }

    @Test
    public void givenEmptyArray_returnFalse() {
        boolean zero = higherNumber.findHighNumber(new int[]{}, 5);
        assertEquals(false, zero);
    }

}

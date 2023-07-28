package com.improve10x.fibonacci.firstelementofanarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayElementsTest {
    private ArrayElements arrayElements;

    @BeforeEach
    public void setup() {
        arrayElements = new ArrayElements();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void given0_return0() {
        int zero = arrayElements.findArrayElement(new int[]{0, 0, 0});
        assertEquals(0, zero);
    }

    @Test
    public void givenEmptyArray_returnMinusOne() {
        int zero = arrayElements.findArrayElement(new int[]{});
        assertEquals(0, zero);
    }

    @Test
    public void givenMinusOne_returnMinusOne() {
        int zero = arrayElements.findArrayElement(new int[]{-1, -1, -1});
        assertEquals(-1, zero);
    }

    @Test
    public void givenOne_returnOne() {
        int zero = arrayElements.findArrayElement(new int[]{1, 1, 1});
        assertEquals(1, zero);
    }

    @Test
    public void givenTwo_returnTwo() {
        int zero = arrayElements.findArrayElement(new int[]{2, 2, 2});
        assertEquals(2, zero);
    }

    @Test
    public void given1And2And3_returnOne() {
        int zero = arrayElements.findArrayElement(new int[]{1, 2, 3});
        assertEquals(1, zero);
    }

    @Test
    public void given80And5And100_return80() {
        int zero = arrayElements.findArrayElement(new int[]{80, 5, 100});
        assertEquals(80, zero);
    }

    @Test
    public void givenNegativeValuesArray_returnNegativeOne() {
        int zero = arrayElements.findArrayElement(new int[]{-500, 0, 50});
        assertEquals(-500, zero);
    }
}

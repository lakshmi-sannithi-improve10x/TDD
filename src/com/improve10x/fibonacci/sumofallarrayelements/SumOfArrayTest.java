package com.improve10x.fibonacci.sumofallarrayelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfArrayTest {
    private SumOfArray sumOfArray;

    @BeforeEach
    public void setup() {
        sumOfArray = new SumOfArray();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenZeros_returnZero() {
        int zero = sumOfArray.findSum(new int[]{0, 0, 0});
        assertEquals(0, zero);
    }

    @Test
    public void givenMinusOne_returnMinusOne() {
        int zero = sumOfArray.findSum(new int[]{-1, -1, -1});
        assertEquals(-1, zero);
    }

    @Test
    public void givenOnes_returnZero() {
        int zero = sumOfArray.findSum(new int[]{1, 1, 1});
        assertEquals(3, zero);
    }

    @Test
    public void giventwos_returnZero() {

        int zero = sumOfArray.findSum(new int[]{2, 2, 2});
        assertEquals(6, zero);
    }

    @Test
    public void givenArray_return13() {
        int zero = sumOfArray.findSum(new int[]{2, 7, 4});
        assertEquals(13, zero);
    }

    @Test
    public void givenArray_return48() {
        int zero = sumOfArray.findSum(new int[]{45, 3, 0});
        assertEquals(48, zero);
    }

    @Test
    public void givenArray_return105() {
        int zero = sumOfArray.findSum(new int[]{-2, 84, 23});
        assertEquals(105, zero);
    }
}

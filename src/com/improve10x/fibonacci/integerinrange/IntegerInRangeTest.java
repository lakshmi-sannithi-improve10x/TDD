package com.improve10x.fibonacci.integerinrange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerInRangeTest {
    private IntegerRange integerRange;

    @BeforeEach
    public void setup() {
        integerRange = new IntegerRange();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenAllZeros_returnTrue() {
        boolean oneAndThreeAndNine = integerRange.findRange(0, 0, 0);
        assertEquals(false, oneAndThreeAndNine);
    }

    @Test
    public void givenAllMinusOne_returnTrue() {
        boolean oneAndThreeAndNine = integerRange.findRange(-1, -1, -1);
        assertEquals(false, oneAndThreeAndNine);
    }

    @Test
    public void givenOneAndThreeAndNine_returnTrue() {
        boolean oneAndThreeAndNine = integerRange.findRange(1, 3, 9);
        assertEquals(true, oneAndThreeAndNine);
    }

    @Test
    public void givenSixAndOneAndSix_returnFalse() {
        boolean sixAndOneAndSix = integerRange.findRange(6, 1, 6);
        assertEquals(false, sixAndOneAndSix);
    }

    @Test
    public void givenThreeAndThreeAndEight_returnTrue() {
        boolean threeAndThreeAndEight = integerRange.findRange(3, 3, 8);
        assertEquals(true, threeAndThreeAndEight);
    }
}

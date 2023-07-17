package com.improve10x.fibonacci.add;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumIsLessThanHundredTest {
    private SumIsLessThanHundred sumIsLessThanHundred;
    @BeforeEach
    public void setup(){
         sumIsLessThanHundred = new SumIsLessThanHundred();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenTwentyTwoAndFifteen_returnTrue(){
        boolean twentyTwoAndFifteen = sumIsLessThanHundred.findSumIsLessThan100(22,15);
        assertEquals(true,twentyTwoAndFifteen);
    }

    @Test
    public void givenEightyThreeAndThirtyFour_returnFalse(){
        boolean eightyThreeAndThirtyFour = sumIsLessThanHundred.findSumIsLessThan100(83,34);
        assertEquals(false,eightyThreeAndThirtyFour);
    }

    @Test
    public void givenThreeAndSeventySeven_returnF(){
        boolean threeAndSeventySeven = sumIsLessThanHundred.findSumIsLessThan100(3,77);
        assertEquals(true,threeAndSeventySeven);
    }

    @Test
    public void given0_returnTue(){
        boolean threeAndSeventySeven = sumIsLessThanHundred.findSumIsLessThan100(0,0);
        assertEquals(true,threeAndSeventySeven);
    }

    @Test
    public void givenMinusOne_returnFalse(){
        boolean threeAndSeventySeven = sumIsLessThanHundred.findSumIsLessThan100(-1,-1);
        assertEquals(true,threeAndSeventySeven);
    }
}

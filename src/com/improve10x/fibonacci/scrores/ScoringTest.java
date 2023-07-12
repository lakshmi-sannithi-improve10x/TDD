package com.improve10x.fibonacci.scrores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {
    private Scoring scoring;
    @BeforeEach
    public void setup(){
          scoring = new Scoring();
    }

    @Test
    public void empty(){
    }

    @Test
    public void givenNull_returnAllZeros(){
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3],allZeros);
    }

    @Test
    public void givenEmpty_returnAllZeros(){
        int[] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3],allZeros);
    }

    @Test
    public void givenA_returnOneZeroZero(){
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[]{1,0,0}, onlyAScores);
    }

    @Test
    public void givenB_returnZeroOneZero(){
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[]{0,1,0}, onlyBScores);
    }

    @Test
    public void givenC_returnZeroZeroOne(){
        int[] onlyCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[]{0,0,1}, onlyCScores);
    }

    @Test
    public void givenAB_returnOneOneZero(){
        int[] onlyABScores = scoring.calculateScores("AB");
        assertArrayEquals(new int[]{1,1,0}, onlyABScores);
    }

    @Test
    public void givenABC_returnOneOneOne(){
        int[] onlyABCScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[]{1,1,1}, onlyABCScores);
    }

    @Test
    public void givenAABC_returnTwoOneOne(){
        int[] onlyAABCScores = scoring.calculateScores("AABC");
        assertArrayEquals(new int[]{2,1,1}, onlyAABCScores);
    }

    @Test
    public void givenABBC_returnOneTwoOne(){
        int[] onlyABBCScores = scoring.calculateScores("ABBC");
        assertArrayEquals(new int[]{1,2,1}, onlyABBCScores);
    }

    @Test
    public void givenABCC_returnOneOneTwo(){
        int[] onlyABCCScores = scoring.calculateScores("ABCC");
        assertArrayEquals(new int[]{1,1,2}, onlyABCCScores);
    }

    @Test
    public void givenABBACCCCAC_returnThreeTwoFive(){
        int[] onlyABCScores = scoring.calculateScores("ABBACCCCAC");
        assertArrayEquals(new int[]{3,2,5}, onlyABCScores);
    }
}

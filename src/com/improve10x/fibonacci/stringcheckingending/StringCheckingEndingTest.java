package com.improve10x.fibonacci.stringcheckingending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckingEndingTest {
    private StringCheckingEnding stringCheckingEnding;
    @BeforeEach
    public  void setup(){
         stringCheckingEnding = new StringCheckingEnding();
    }
    @Test
    public void nothing(){

    }

    @Test
    public  void givenNull_returnFalse(){
        boolean text = stringCheckingEnding.findSuffix("null","null");
        assertEquals(true,text);
    }
    @Test
    public  void givenEmptyString_returnTrue(){
        boolean text = stringCheckingEnding.findSuffix("","");
        assertEquals(true,text);
    }
    @Test
    public  void givenAbc_returnTrue(){
        boolean text = stringCheckingEnding.findSuffix("abc","bc");
        assertEquals(true,text);
    }

    @Test
    public  void givenAbcAndD_returnTrue(){
        boolean text = stringCheckingEnding.findSuffix("abc","d");
        assertEquals(false,text);
    }

    @Test
    public void givenSamurai_returnFalse(){
        boolean text = stringCheckingEnding.findSuffix("samurai","zi");
        assertEquals(false,text);
    }

    @Test
    public void givenFeminine_returnTrue(){
        StringCheckingEnding stringCheckingEnding = new StringCheckingEnding();
        boolean text = stringCheckingEnding.findSuffix("feminine","nine");
        assertEquals(true,text);
    }

    @Test
    public void givenConvention_returnFalse(){
        StringCheckingEnding stringCheckingEnding = new StringCheckingEnding();
        boolean text = stringCheckingEnding.findSuffix("Convention","tio");
        assertEquals(false,text);
    }
}

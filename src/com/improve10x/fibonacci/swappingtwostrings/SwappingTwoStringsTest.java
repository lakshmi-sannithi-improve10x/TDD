package com.improve10x.fibonacci.swappingtwostrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwappingTwoStringsTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenOneTwo_returnTwoOne(){
        SwappingTwoStrings swappingTwoStrings = new  SwappingTwoStrings();
        String oneTwo = swappingTwoStrings.swapStrings("one","two");
        assertEquals("two","one",oneTwo);
    }
}

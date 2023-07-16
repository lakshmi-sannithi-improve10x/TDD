package com.improve10x.fibonacci.stringcheckingending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckingEndingTest {

    @Test
    public void nothing(){

    }

    @Test
    public  void givenAbc_returnTrue(){
        StringCheckingEnding stringCheckingEnding = new StringCheckingEnding();
       boolean abc = stringCheckingEnding.findSuffix("abc","bc");
       assertEquals(false,abc);
    }
}

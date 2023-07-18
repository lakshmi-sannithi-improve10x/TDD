package com.improve10x.fibonacci.arethenumbersequal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegersAreEqualTest {

    @Test
    public  void nothing(){

    }

    @Test
    public void givenMinusTen_returnTrue(){
        IntegersAreEqual integersAreEqual = new IntegersAreEqual();
        boolean minusTen =  integersAreEqual.isEqual(-10,-12);
        assertEquals(false,minusTen);
    }

    @Test
    public void givenMinusOne_returnTrue(){
        IntegersAreEqual integersAreEqual = new IntegersAreEqual();
        boolean minusOne =  integersAreEqual.isEqual(-1,-1);
        assertEquals(true,minusOne);
    }

    @Test
    public void givenOne_returnTrue(){
        IntegersAreEqual integersAreEqual = new IntegersAreEqual();
        boolean one =  integersAreEqual.isEqual(1,1);
        assertEquals(true,one);
    }

    @Test
    public void givenFiveAndSix_returnFalse(){
        IntegersAreEqual integersAreEqual = new IntegersAreEqual();
        boolean number =  integersAreEqual.isEqual(5,6);
        assertEquals(false,number);
    }

    @Test
    public void given36And35_returnFalse(){
        IntegersAreEqual integersAreEqual = new IntegersAreEqual();
        boolean minusTen =  integersAreEqual.isEqual(36,35);
        assertEquals(false,minusTen);
    }
}

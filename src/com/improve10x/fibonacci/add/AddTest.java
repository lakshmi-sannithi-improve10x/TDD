package com.improve10x.fibonacci.add;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenTwentyTwoAndFifteen_returnTrue(){
        Add add = new Add();
        boolean twentyTwoAndFifteen = add.sumIsLessThan100(22,15);
        assertEquals(true,twentyTwoAndFifteen);
    }

    @Test
    public void givenEightyThreeAndThirtyFour_returnFalse(){
        Add add = new Add();
        boolean eightyThreeAndThirtyFour = add.sumIsLessThan100(83,34);
        assertEquals(false,eightyThreeAndThirtyFour);
    }

    @Test
    public void givenThreeAndSeventySeven_returnF(){
        Add add = new Add();
        boolean threeAndSeventySeven = add.sumIsLessThan100(3,77);
        assertEquals(true,threeAndSeventySeven);
    }
}

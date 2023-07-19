package com.improve10x.fibonacci.upvotesvsdownvotes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpvotesVsDownvotesTest {
    private UpvotesVsDownvotes upvotesVsDownvotes;
    @BeforeEach
    public void setup(){
         upvotesVsDownvotes = new UpvotesVsDownvotes();
    }
    @Test
    public void nothing(){

    }

    @Test
    public void  givenZero_returnZero(){
        int zero = upvotesVsDownvotes.findVotes(0,0);
        assertEquals(0,zero);
    }

    @Test
    public void  givenNegativeNumber_returnNegativeOne(){
        int minusOne = upvotesVsDownvotes.findVotes(-1,-1);
        assertEquals(-1,minusOne);
    }

    @Test
    public void  givenThirteenAndZero_returnZero(){
        int thirteenAndZero = upvotesVsDownvotes.findVotes(13,0);
        assertEquals(13,thirteenAndZero);
    }

    @Test
    public void  givenTwoAndThirtyThree_returnMinusThirtyOne(){
        int twoAndThirtyThree = upvotesVsDownvotes.findVotes(2,33);
        assertEquals(-31,twoAndThirtyThree);
    }

    @Test
    public void  given132_returnZero(){
        UpvotesVsDownvotes upvotesVsDownvotes = new UpvotesVsDownvotes();
        int value = upvotesVsDownvotes.findVotes(132,132);
        assertEquals(0,value);
    }
}

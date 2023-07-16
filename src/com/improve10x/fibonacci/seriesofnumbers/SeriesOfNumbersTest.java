package com.improve10x.fibonacci.seriesofnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeriesOfNumbersTest {

    @Test
    public void nothing(){

    }

    @Test
    public  void  givenOne_returnOne(){
        SeriesOfNumbers seriesOfNumbers = new SeriesOfNumbers();
        int one = seriesOfNumbers.findNumber(1);
        assertEquals(1,one);
    }

    @Test
    public  void  givenTwo_returnOneTwo(){
        SeriesOfNumbers seriesOfNumbers = new SeriesOfNumbers();
        int two = seriesOfNumbers.findNumber(2);
        assertEquals(3,two);
    }

    @Test
    public  void  givenThree_returnOneTwoThree(){
        SeriesOfNumbers seriesOfNumbers = new SeriesOfNumbers();
        int three = seriesOfNumbers.findNumber(3);
        assertEquals(1,2,3, String.valueOf(three));
    }

    @Test
    public  void  givenFour_return1234(){
        SeriesOfNumbers seriesOfNumbers = new SeriesOfNumbers();
        int four = seriesOfNumbers.findNumber(4);

    }


}

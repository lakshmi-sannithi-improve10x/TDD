package com.improve10x.fibonacci.agetodays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeToDaysTest {
    private AgeToDays ageToDays;
    @BeforeEach
    public void setup(){
        ageToDays = new AgeToDays();
    }
    @Test
    public  void nothing(){

    }

    @Test
    public void givenMinusTen_returnMinusOne(){
        int ageSixtyFive = ageToDays.convertAgeToDays(-10);
        assertEquals(-1,ageSixtyFive);
    }

    @Test
    public void givenMinusOne_returnMinusOne(){
        int ageSixtyFive = ageToDays.convertAgeToDays(-1);
        assertEquals(-1,ageSixtyFive);
    }

    @Test
    public void givenZeroAge_returnZeroDays(){
        int ageZero = ageToDays.convertAgeToDays(0);
        assertEquals(0,ageZero);
    }

    @Test
    public void given65Age_return23725Days(){
        int ageSixtyFive = ageToDays.convertAgeToDays(65);
       assertEquals(23725,ageSixtyFive);
    }

    @Test
    public void given20Age_return7300Days(){
        int ageSixtyFive = ageToDays.convertAgeToDays(20);
        assertEquals(7300,ageSixtyFive);
    }

    @Test
    public void giveAgeOne_return365Days(){
        int ageSixtyFive = ageToDays.convertAgeToDays(1);
        assertEquals(365,ageSixtyFive);
    }


    @Test
    public void giveAge2_return730Days(){
        int ageSixtyFive = ageToDays.convertAgeToDays(2);
        assertEquals(730,ageSixtyFive);
    }

    @Test
    public void giveAge6_return2190Days(){
        int ageSixtyFive = ageToDays.convertAgeToDays(6);
        assertEquals(2190,ageSixtyFive);
    }
}

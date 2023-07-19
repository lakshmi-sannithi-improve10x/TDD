package com.improve10x.fibonacci.nthevennumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthEvenNumberTest {

    private NthEvenNumber nthEvenNumber;

    @BeforeEach
    public void setup() {
        nthEvenNumber = new NthEvenNumber();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNegativeOne_returnNegativeOne() {
        int evenNumber = nthEvenNumber.findEvenNumber(-1);
        assertEquals(-1, evenNumber);
    }

    @Test
    public void givenNegativeTen_returnNegativeOne() {
        int evenNumber = nthEvenNumber.findEvenNumber(-10);
        assertEquals(-1, evenNumber);
    }
    @Test
    public void givenOne_returnEvenNumberIsTwo() {
        int evenNumber = nthEvenNumber.findEvenNumber(1);
        assertEquals(0, evenNumber);
    }
    @Test
    public void givenEvenNumberIsTwo_returnEvenNumberIsTwo() {
        int evenNumber = nthEvenNumber.findEvenNumber(2);
        assertEquals(2, evenNumber);
    }

    @Test
    public void givenEvenNumberIsTen_returnEvenNumberIsEighteen() {
        int evenNumber = nthEvenNumber.findEvenNumber(10);
        assertEquals(16, evenNumber);
    }

    @Test
    public void givenEvenNumberIsSix_returnEvenNumberIsEight() {
        int evenNumber = nthEvenNumber.findEvenNumber(6);
        assertEquals(10, evenNumber);
    }

    @Test
    public void givenEvenNumberIsHundred_returnEvenNumberIsOneNinetyEight() {
        int evenNumber = nthEvenNumber.findEvenNumber(100);
        assertEquals(198, evenNumber);
    }

    @Test
    public void givenEvenNumberIsSixty_returnEvenNumberIsOneOneEight() {
        int evenNumber = nthEvenNumber.findEvenNumber(60);
        assertEquals(118, evenNumber);
    }

    @Test
    public void givenEvenNumberIsThousand_returnEvenNumberIsNineteenNinetyEight() {
        int evenNumber = nthEvenNumber.findEvenNumber(1000);
        assertEquals(1998, evenNumber);
    }

}

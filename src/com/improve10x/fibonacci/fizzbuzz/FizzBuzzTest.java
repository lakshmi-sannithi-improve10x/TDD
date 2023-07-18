package com.improve10x.fibonacci.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void givenMinusOne_returnEmptyString(){
        String numberThree = fizzBuzz.findFizzBuzz(-1);
        assertEquals("",numberThree);
    }

    @Test
    public void givenZero_returnEmptyString(){
        String numberThree = fizzBuzz.findFizzBuzz(0);
        assertEquals("",numberThree);
    }
    @Test
    public void givenNumberIsMultipleOf3_returnFizz(){
        String numberThree = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz",numberThree);
    }

    @Test
    public void givenNumberIsMultipleOf5_returnBuzz(){
        String numberFive = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz",numberFive);
    }

    @Test
    public void givenMultipleFiveAndThree_returnFizzBuzz(){
        String multipleOfThreeAndFive = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz",multipleOfThreeAndFive);
    }

    @Test
    public void givenFour_returnFour(){
        String multipleOfThreeAndFive = fizzBuzz.findFizzBuzz(4);
        assertEquals("4",multipleOfThreeAndFive);
    }
}

package com.improve10x.fibonacci.perimeterofrectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimeterOfRectangleTest {

    private PerimeterOfRectangle perimeterOfRectangle;

    @BeforeEach
    public void setup() {
        perimeterOfRectangle = new PerimeterOfRectangle();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenMinusTenAndMinusTen_returnPerimeter() {
        int number = perimeterOfRectangle.findPerimeterOfRectangle(-10, -10);
        assertEquals(-1, number);
    }

    @Test
    public void givenMinusOneAndMinusOne_returnPerimeter() {
        int number = perimeterOfRectangle.findPerimeterOfRectangle(-1, -1);
        assertEquals(-1, number);
    }
    @Test
    public void givenLengthAndWidth_returnPerimeter() {
        int number = perimeterOfRectangle.findPerimeterOfRectangle(0, 0);
        assertEquals(0, number);
    }

    @Test
    public void givenSixAndSeven_returnPerimeter() {
        int number = perimeterOfRectangle.findPerimeterOfRectangle(6, 7);
        assertEquals(26, number);
    }

    @Test
    public void givenTwenty_returnPerimeter() {
        int number = perimeterOfRectangle.findPerimeterOfRectangle(20, 10);
        assertEquals(60, number);
    }

    @Test
    public void givenTwo_returnPerimeter() {
        int number = perimeterOfRectangle.findPerimeterOfRectangle(2, 9);
        assertEquals(22, number);
    }
}

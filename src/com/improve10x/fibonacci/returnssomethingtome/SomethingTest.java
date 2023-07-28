package com.improve10x.fibonacci.returnssomethingtome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomethingTest {
    private Something something;

    @BeforeEach
    public void setup() {
        something = new Something();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnsSomething() {
        String text = something.findWord(null);
        assertEquals("Something", text);
    }


    @Test
    public void givenEmptyString_returnsSomething() {
        String text = something.findWord("");
        assertEquals("Something", text);
    }

    @Test
    public void givenbe_returnsSomethingbe() {
        String text = something.findWord("be");
        assertEquals("Something be", text);
    }

    @Test
    public void givenBetter_returnsSomethingBetter() {
        String text = something.findWord("better");
        assertEquals("Something better", text);
    }

    @Test
    public void givenisbetterthannothing_returnsSomethingisbetterthannothing() {
        String text = something.findWord("is better than nothing");
        assertEquals("Something is better than nothing", text);
    }

    @Test
    public void givenBobJane_returnsSomethingBobJan() {
        String text = something.findWord("Bob Jane");
        assertEquals("Something Bob Jane", text);
    }

    @Test
    public void givenSomething_returnsSomething() {
        String text = something.findWord("Something");
        assertEquals("Something Something", text);
    }

}

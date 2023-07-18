package com.improve10x.fibonacci.Bomb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BombTest {

    private TheBomb theBomb;

    @BeforeEach
    public void setUp() {
        theBomb = new TheBomb();
    }

    @Test
    public void nothing() {
    }

    //bomb("There is a bomb.") ➞ "DUCK!"

    @Test
    public void givenNull_returnDUCK() {
        String text = theBomb.CheckWord("null");
        assertEquals(null, text);
    }

    @Test
    public void givenEmptyString_returnDUCK() {
        String text = theBomb.CheckWord("");
        assertEquals("", text);
    }


    @Test
    public void givenThereIsABomb_returnDUCK() {
        String text = theBomb.CheckWord("there is bomb ");
        assertEquals("DUCK!", text);
    }

    @Test
    public void givenText_returnDUCKWithExclamationMark() {
        String text = theBomb.CheckWord("BOMB in my home");
        assertEquals("DUCK!", text);
    }

    @Test
    public void givenText_returnRelax() {
        String text = theBomb.CheckWord("Holiday goes on");
        assertEquals("Relax, there's no bomb.", text);
    }

}

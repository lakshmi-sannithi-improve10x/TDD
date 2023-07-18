package com.improve10x.fibonacci.namegreeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameGreetingTest {

    private Greeting nameGreeting;

    @BeforeEach
    public void setup() {
        nameGreeting = new Greeting();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnEmptyName() {
        String name = nameGreeting.setNameGreeting("null");
        assertEquals(null, name);
    }

    @Test
    public void givenEmptyName_returnEmpty() {
        String name = nameGreeting.setNameGreeting("");
        assertEquals("", name);
    }

    @Test
    public void givenEmptyName_returnEmptyName() {
        String name = nameGreeting.setNameGreeting("world");
        assertEquals("hello world!", name);
    }

    @Test
    public void givenNameBye_returnHelloByeExclamationMark() {
        String name = nameGreeting.setNameGreeting("Bye");
        assertEquals("hello Bye!", name);
    }

    @Test
    public void givenSai_returnSaiExclamationMark() {
        String name = nameGreeting.setNameGreeting("Sai");
        assertEquals("hello Sai!", name);
    }

    @Test
    public void givenNameHi_returnHelloHi() {
        String name = nameGreeting.setNameGreeting("hi hello there is bomb don't go  ");
        assertEquals("hello hi hello there is bomb don't go  !", name);
    }

    @Test
    public void givenNameTiffany_returnHelloTiffanyExclamationMark() {
        String name = nameGreeting.setNameGreeting("Tiffany");
        assertEquals("hello Tiffany!", name);
    }

    @Test
    public void givenNameGerald_returnHelloGeraldExclamationMark() {
        String name = nameGreeting.setNameGreeting("Gerald");
        assertEquals("hello Gerald!", name);
    }

    @Test
    public void givenNameEd_returnHelloEdExclamationMark() {
        String name = nameGreeting.setNameGreeting("  Good morning to all");
        assertEquals("hello   Good morning to all!", name);
    }
}


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
    public void givenEmptyName_returnEmptyName() {
        String name = nameGreeting.setNameGreeting("");
        assertEquals("hello !", name);
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
        String name = nameGreeting.setNameGreeting("hi");
        assertEquals("hello hi!", name);
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
        String name = nameGreeting.setNameGreeting("Ed");
        assertEquals("hello Ed!", name);
    }
}


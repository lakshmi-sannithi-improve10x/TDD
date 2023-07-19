package com.improve10x.fibonacci.stringispalindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringIsPalindromeTest {
    private StringIsPalindrome stringIsPalindrome;
    @BeforeEach
    public void setup(){
         stringIsPalindrome = new StringIsPalindrome();
    }
    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnFalse() {
        boolean text = stringIsPalindrome.findPalindrome("null");
        assertEquals(false, text);
    }

    @Test
    public void givenEmptyString_returnTrue() {
        boolean text = stringIsPalindrome.findPalindrome("");
        assertEquals(true, text);
    }

    @Test
    public void givenA_returnTrue() {
        boolean text = stringIsPalindrome.findPalindrome("a");
        assertEquals(true, text);
    }

    @Test
    public void givenAb_returnFalse() {
        boolean text = stringIsPalindrome.findPalindrome("ab");
        assertEquals(false, text);
    }
    @Test
    public void givenNeuquen_returnTrue() {
        boolean text = stringIsPalindrome.findPalindrome("neuquen");
        assertEquals(true, text);
    }

    @Test
    public void givenNotAPalindrome_returnFalse() {
        boolean text = stringIsPalindrome.findPalindrome("Not a Palindrome");
        assertEquals(false, text);
    }

    @Test
    public void givenText_returnTrue() {
        boolean text = stringIsPalindrome.findPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!");
        assertEquals(false, text);
    }
}

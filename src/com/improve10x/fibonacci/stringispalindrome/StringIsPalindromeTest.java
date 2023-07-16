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

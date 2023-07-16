package com.improve10x.fibonacci.stringispalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringIsPalindromeTest {

    @Test
    public void  nothing(){

    }

    @Test
    public void givenNeuquen_returnTrue(){
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        boolean neuquen = stringIsPalindrome.findPalindrome("neuquen");
        assertEquals(true,neuquen);
    }

    @Test
    public void givenNotAPalindrome_returnFalse(){
        StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
        boolean neuquen = stringIsPalindrome.findPalindrome("Not a Palindrome");
        assertEquals(false,neuquen);
    }
}

package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void not_a_palindrome() throws Exception{
         String expected="4332 is not a palindrome";
         Palindrome p=new Palindrome();
         String actual=p.palindrome(4332);
         assertEquals(expected,actual);
    }
    @Test
    public void palindrome_lessthan() throws Exception{
        String expected="2332 is a palindrome and is less than 25";
        Palindrome p=new Palindrome();
        String actual=p.palindrome(2332);
        assertEquals(expected,actual);
    }
    @Test
    public void palindrome_greaterthan() throws Exception{
        String expected="838838 is a palindrome and is greater than 25";
        Palindrome p=new Palindrome();
        String actual=p.palindrome(838838);
        assertEquals(expected,actual);
    }

}
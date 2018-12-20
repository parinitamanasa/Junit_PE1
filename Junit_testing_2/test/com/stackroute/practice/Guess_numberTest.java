package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Guess_numberTest {
    @Test
    public void matching() throws Exception{
        String expected="Matches the target";
        Guess_number gn=new Guess_number();
        String actual=gn.guess(23);
        assertEquals(expected,actual);
    }

}
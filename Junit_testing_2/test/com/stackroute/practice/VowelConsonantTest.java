package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    @Test
    public void vowelconsonanttetsing_twocharacters() throws Exception{
        String expected="m -Consonant a -Vowel ";
        VowelConsonant vc=new VowelConsonant();
        String actual=vc.vowelconsonant("ma");
        assertEquals(expected,actual);
    }
    @Test
    public void vowelconsonanttesting() throws Exception{
        String expected="m -Consonant a -Vowel n -Consonant a -Vowel s -Consonant a -Vowel ";
        VowelConsonant vc=new VowelConsonant();
        String actual=vc.vowelconsonant("manasa");
        assertEquals(expected,actual);
    }

}
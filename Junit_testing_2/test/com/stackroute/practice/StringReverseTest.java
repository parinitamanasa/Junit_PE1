package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    @Test
    public void reverse_london() throws Exception{
        String expected="nodnol";
        StringReverse sr=new StringReverse();
        String actual=sr.reverse("london");
        assertEquals(expected,actual);
    }
    @Test
    public void reverse_madam() throws Exception{
        String expected="madam";
        StringReverse sr=new StringReverse();
        String actual=sr.reverse("madam");
        assertEquals(expected,actual);
    }
}
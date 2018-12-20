package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphanumericTest {
    @Test
    public void capital() throws Exception{
        String expected="Capital";
        Alphanumeric an=new Alphanumeric();
        String actual=an.alphanumeric('A');
        assertEquals(expected,actual);
    }
    @Test
    public void lowercase() throws Exception {
        String expected = "Lower case";
        Alphanumeric an = new Alphanumeric();
        String actual = an.alphanumeric('c');
        assertEquals(expected, actual);
    }
    @Test
    public void specialcharacter() throws Exception {
        String expected = "Special Character";
        Alphanumeric an = new Alphanumeric();
        String actual = an.alphanumeric('%');
        assertEquals(expected, actual);
    }
}
package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    @Test
    public void tom() throws Exception{
        String expected="Tom";
        TomJerry t=new TomJerry();
        String actual=t.tomjerry(23);
        assertEquals(expected,actual);
    }
    @Test
    public void jerry() throws Exception{
        String expected="Jerry";
        TomJerry t=new TomJerry();
        String actual=t.tomjerry(28);
        assertEquals(expected,actual);
    }
    @Test
    public void ret_invalid() throws Exception{
        String expected="-1";
        TomJerry t=new TomJerry();
        String actual=t.tomjerry(3);
        assertEquals(expected,actual);
    }
}
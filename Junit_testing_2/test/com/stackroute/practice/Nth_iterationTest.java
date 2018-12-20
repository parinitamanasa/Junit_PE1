package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Nth_iterationTest {
    @Test
    public void fifth_iteration() throws Exception{
        String expected="122333444455555";
        Nth_iteration num=new Nth_iteration();
        String actual=num.nth_iteration(5);
        assertEquals(expected,actual);
    }

}
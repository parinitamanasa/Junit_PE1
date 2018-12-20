package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public void sorting_false() throws Exception{
        String expected="544332 10 false";
        Sorting so=new Sorting();
        String actual=so.sorting(234534);
        assertEquals(expected,actual);
    }
    @Test
    public void sorting_true() throws Exception{
        String expected="88532 18 true";
        Sorting so=new Sorting();
        String actual=so.sorting(58382);
        assertEquals(expected,actual);
    }

}
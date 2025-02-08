package com.lenka._GitHug_Proj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {   
   
    @Test
    public void testAddPositive()
    {
    	App app=new App();
    	int expected=30;
    	int actual=app.sub(10, 20);
        assertEquals(expected, actual);
    }
}

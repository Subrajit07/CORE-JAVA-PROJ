package com.lenka;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	public App app;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    	 
        super( testName );
        app=new App();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

  public void testAddition() {
	  int actual=app.add(10, 15);
	  int expected=25;
	  assertEquals(expected, actual);
  }
  
  public void testSubstraction() {
	  int actual=app.sub(25, 10);
	  int expected=15;
	  assertEquals(expected, actual);
  }
  
  public void testAddNegative() {
	  int actual=app.add(-45, -10);
	  int expected=-55;
	  assertEquals(expected, actual);
  }
    public void testApp()
    {
        assertTrue( true );
    }
}

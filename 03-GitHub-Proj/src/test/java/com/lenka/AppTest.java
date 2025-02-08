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
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

  public void testAddition() {
	  App app=new App();
	  int actual=app.add(10, 15);
	  int expected=25;
	  assertEquals(expected, actual);
  }
    public void testApp()
    {
        assertTrue( true );
    }
}

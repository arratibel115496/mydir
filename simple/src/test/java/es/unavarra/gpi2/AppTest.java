package es.unavarra.gpi2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void checkInputConsole()
    {
        GPIA115496 myClass = new GPIA115496();
	String inputString = myClass.getMessage();
	assertTrue(inputString.equals( "Test"));
    }
}

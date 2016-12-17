package tdd.xtr;

import static org.junit.Assert.*;

import org.junit.*;

public class MeterTest {

	
	/**
	 * 5*2 = 10
	 * make length private- earlier it was public, then made it private
	 * remove side-effects (mutability)
	 * Test equality
	 */
	
    @Test 
    public void should_test_multiplication() {
    	Meter five = new Meter(5);//Arrange
    	Meter product = five.times(2);//Act
    	assertEquals(new Meter(10), product);//this will also assert equality. //This is the assert part
    	product = five.times(3);
    	assertEquals(new Meter(15), product);
    }
    
    @Test
    public void should_test_equality() {
    	assertTrue(new Meter(5).equals(new Meter(5)));
    	assertFalse(new Meter(5).equals(new Meter(6)));
    }
    
}

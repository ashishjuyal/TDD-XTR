package tdd.xtr;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

	/**
	 * should divide by 3
	 * should divide by 5
	 * should divide by both 3 and 5
	 * make variable private
	 * make mutable
	 * Test equality
	 * 
	 * make length private- earlier it was public, then made it private
	 * remove side-effects (mutability)
	 * Test equality
	 */
	@Test
	public void should_return_Fizz() {
		FizzBuzz obj = new FizzBuzz(3);//Arrange
		String str = obj.myMethod();//Act
		assertEquals("Fizz", str);//Asert
		
		obj = new FizzBuzz(4);//Arrange
		assertFalse(obj.myMethod().equals("Fizz"));
		
		obj = new FizzBuzz(15);//Arrange
		assertTrue(obj.myMethod().equals("FizzBuzz"));
	}
	
	
	
}

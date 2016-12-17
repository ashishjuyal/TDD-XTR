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
		
	}
	
	@Test
	public void should_return_Buzz() {
		FizzBuzz obj = new FizzBuzz(5);//Arrange
		assertTrue(obj.myMethod().equals("Buzz"));
	}
	
	@Test
	public void should_return_FizzBuzz() {
		FizzBuzz obj = new FizzBuzz(15);//Arrange
		assertTrue(obj.myMethod().equals("FizzBuzz"));
	}
	
	@Test
	public void should_return_Number() {
		FizzBuzz obj = new FizzBuzz(1);//Arrange
		assertTrue(obj.myMethod().equals("1"));
	}
	
	@Test
	public void should_check_Equality() {
		FizzBuzz obj1 = new FizzBuzz(1);//Arrange
		FizzBuzz obj2 = new FizzBuzz(1);  
		assertTrue(obj1.equals(obj2));
	}
	
}

package tdd.xtr;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzNitin {
	
	
	
	@Test
	public void should_number(){
		FizzBuzzSrc fizzbuzz = new FizzBuzzSrc();
		Assert.assertEquals("1", fizzbuzz.checkfizzbuzz(1));
		
		Assert.assertEquals("2", fizzbuzz.checkfizzbuzz(2));
	}

}

package tdd.xtr;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void 
	should_Be_Number(){
		FizBuzz fizBuz=new FizBuzz();
		String fizCheck =fizBuz.checkFizzBuzz(1);
		
		Assert.assertEquals("1",fizCheck);
		fizCheck=fizBuz.checkFizzBuzz(4);
		Assert.assertEquals("4",fizCheck);
		
		fizCheck=fizBuz.checkFizzBuzz(8);
		Assert.assertEquals("8",fizCheck);
	}
	
	@Test
	public void 
	should_Be_Fizz(){
		FizBuzz fizBuz=new FizBuzz();
		String fizCheck =fizBuz.checkFizzBuzz(3);
		
		Assert.assertEquals("Fizz",fizCheck);
		
		fizCheck =fizBuz.checkFizzBuzz(6);
		Assert.assertEquals("Fizz",fizCheck);
		
		fizCheck =fizBuz.checkFizzBuzz(12);
		Assert.assertEquals("Fizz",fizCheck);
		
	}
	
	@Test
	public void 
	should_Be_Buzz(){
		FizBuzz fizBuz=new FizBuzz();
		String fizCheck=fizBuz.checkFizzBuzz(5);
		Assert.assertEquals("Buzz",fizCheck);
		fizCheck=fizBuz.checkFizzBuzz(20);
		Assert.assertEquals("Buzz",fizCheck);
	}
	
	@Test
	public void 
	should_Be_FizzBuzz(){
		FizBuzz fizBuz=new FizBuzz();
		String fizCheck=fizBuz.checkFizzBuzz(30);
		Assert.assertEquals("FizzBuzz",fizCheck);
		fizCheck=fizBuz.checkFizzBuzz(450);
		Assert.assertEquals("FizzBuzz",fizCheck);
		fizCheck=fizBuz.checkFizzBuzz(240);
		Assert.assertEquals("FizzBuzz",fizCheck);
	}
}

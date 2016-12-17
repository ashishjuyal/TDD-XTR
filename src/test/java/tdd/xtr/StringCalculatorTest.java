package tdd.xtr;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

	@Test
	public void should_show_zero_when_empty() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("0", strCalculator.evaluate(""));
	}
	
	@Test
	public void should_show_1_with_1() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("1", strCalculator.evaluate("1"));
	}
	
	
	
	private class StringCalculator {
		
		public String evaluate(String toEvaluate) {
			return "0";
		}
		
	}
	
}

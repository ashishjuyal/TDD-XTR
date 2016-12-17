package tdd.xtr;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

	@Test
	public void should_show_zero_when_empty() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("0", strCalculator.evaluate(""));
	}
	
	
	
	private class StringCalculator {
		
		public String evaluate(String toEvaluate) {
			return null;
		}
		
	}
	
}

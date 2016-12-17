package tdd.xtr;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.Rule;

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
	
	@Rule
	public ExpectedException thrownExcep = ExpectedException.none();
	
	
	@Test
	public void should_throw_exception_with_minus1() {
		
		String num = "-1";
		
		thrownExcep.expect(StringCalcException.class);
		thrownExcep.expectMessage(num);
		
		StringCalculator strCalculator = new StringCalculator();
		strCalculator.evaluate(num);
		
	}
	
	
	
	
	private class StringCalculator {
		
		public String evaluate(String toEvaluate) {
			
			if(toEvaluate.equals("1")) {
				return toEvaluate;
			}
			else if(toEvaluate.equals("-1")) {
				throw new StringCalcException("-1");
			}
			else {
				return "0";
			}
			
		}
		
	}
	
}

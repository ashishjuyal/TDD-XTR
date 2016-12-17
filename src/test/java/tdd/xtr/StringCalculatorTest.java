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
	
	@Test
	public void should_show_3_with_12() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("3", strCalculator.evaluate("1,2"));
	}
	
	
	
	
	private class StringCalculator {
		
		public String evaluate(String toEvaluate) {
			
			String[] numbers;
			
			if(toEvaluate.equals("1")) {
				return toEvaluate;
			}
			else if(toEvaluate.equals("-1")) {
				throw new StringCalcException("-1");
			}
			else if(toEvaluate.contains(",")) {
				int sum = 0;
				numbers = toEvaluate.split(",");
				for (String val : numbers) {
					sum += Integer.valueOf(val);
				}
				return String.valueOf(sum);
			}
			else {
				return "0";
			}
			
		}
		
	}
	
}

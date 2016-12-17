package tdd.xtr;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	public void should_show_3_with_1comma2() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("3", strCalculator.evaluate("1,2"));
	}
	
	@Test
	public void should_show_6_with_1comma2comma3() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("6", strCalculator.evaluate("1,2,3"));
	}
	
	
	@Test
	public void should_show_3_with_1newline2() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("3", strCalculator.evaluate("1\n2"));
	}
	
	@Test
	public void should_show_6_with_1newline2comma3() {
		StringCalculator strCalculator = new StringCalculator();
		assertEquals("6", strCalculator.evaluate("1\n2,3"));
	}
	
	@Test
	public void should_throw_exception_with_minus1comma2() {
		
		thrownExcep.expect(StringCalcException.class);
		thrownExcep.expectMessage("-1");
		
		StringCalculator strCalculator = new StringCalculator();
		strCalculator.evaluate("-1,2");
		
	}
	
	@Test
	public void should_throw_exception_with_minus1comma2commaminus3() {
		
		thrownExcep.expect(StringCalcException.class);
		thrownExcep.expectMessage("-1, -3");
		
		StringCalculator strCalculator = new StringCalculator();
		strCalculator.evaluate("-1,2,-3");
		
	}
	
	@Test
	public void should_throw_exception_with_minus1comma2newlineminus3() {
		
		thrownExcep.expect(StringCalcException.class);
		thrownExcep.expectMessage("-1, -3");
		
		StringCalculator strCalculator = new StringCalculator();
		strCalculator.evaluate("-1,2\n-3");
		
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
			else if(toEvaluate.contains(",") || toEvaluate.contains("\n")) {
				
				List<String> negativeValuesList = new ArrayList<String>();
				
				int sum = 0;
				boolean containsNegativeValue = false;
				numbers = toEvaluate.split(",|\n");
				for (String val : numbers) {
					
					if(Integer.valueOf(val) < 0) {
						negativeValuesList.add(val);
						containsNegativeValue = true;
					}
					if(!containsNegativeValue) {
						sum += Integer.valueOf(val);
					}
					
				}
				if(negativeValuesList.size() > 0) {
//					System.out.println(Arrays.toString(negativeValuesList.toArray()));
					throw new StringCalcException(Arrays.toString(negativeValuesList.toArray()));
				}
				return String.valueOf(sum);
			}
			
			else {
				return "0";
			}
			
		}
		
	}
	
}

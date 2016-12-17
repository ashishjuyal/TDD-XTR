package tdd.xtr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalTest {
	StringCalculator strcalc;
	
	@Before
	public void setup(){
		strcalc = new StringCalculator();
	}
	@Test
	public void check_sum_for_empty_string(){
		Assert.assertEquals(0,strcalc.checksum(""));
	}
	
	@Test
	public void check_sum_for_single_positive_no(){
		Assert.assertEquals(0,strcalc.checksum("0"));
	}
	
	@Test
	public void check_sum_for_commaseperated_positive_numbers(){
		Assert.assertEquals(3,strcalc.checksum("1,2"));		
	}
	
	@Test
	public void check_sum_for_lineseperated_positive_numbers(){
		Assert.assertEquals(3,strcalc.checksum("1\n2"));
	}
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void expectedExceptionOnNegativeNumber(){
		thrown.expect(RuntimeException.class);
	    thrown.expectMessage("Happened[-1, -2]");
	    strcalc.checksum("-1\n-2");
		
	}
	
	

}

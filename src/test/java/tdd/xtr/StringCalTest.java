package tdd.xtr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
		Assert.assertEquals(1,strcalc.checksum("1"));
		Assert.assertEquals(12,strcalc.checksum("12"));
	}
	
	@Test
	public void check_sum_for_commaseperated_positive_numbers(){
		Assert.assertEquals(3,strcalc.checksum("1,2"));
		Assert.assertEquals(6,strcalc.checksum("1,2,3"));
		Assert.assertEquals(3,strcalc.checksum("1\n2"));
		
	}
	
	@Test
	public void check_sum_for_lineseperated_positive_numbers(){
		Assert.assertEquals(3,strcalc.checksum("1\n2"));
	}

}

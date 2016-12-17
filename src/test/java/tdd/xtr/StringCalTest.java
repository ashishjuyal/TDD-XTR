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
	}

}

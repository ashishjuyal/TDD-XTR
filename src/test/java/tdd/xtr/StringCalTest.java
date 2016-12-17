package tdd.xtr;

import org.junit.Assert;
import org.junit.Test;

public class StringCalTest {
	
	
	@Test
	public void check_sum_for_empty_string(){
		StringCalculator strcalc = new StringCalculator();
		Assert.assertEquals(0,strcalc.checksum(""));
	}

}

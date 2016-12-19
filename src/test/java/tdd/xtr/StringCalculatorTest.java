package tdd.xtr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test public void
    should_return_zero_for_empty_string() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    private class StringCalculator {
        public int add(String input) {
            return -1;
        }
    }
}

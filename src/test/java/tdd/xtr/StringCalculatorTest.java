package tdd.xtr;

import org.junit.Test;

import static java.lang.Integer.valueOf;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test public void
    should_return_zero_for_empty_string() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test public void
    should_return_the_same_number_when_single_number() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(4, stringCalculator.add("4"));
        assertEquals(5, stringCalculator.add("5"));
    }

    private class StringCalculator {
        public int add(String input) {
            if(input.isEmpty()) {
                return 0;
            }
            return valueOf(input);
        }
    }
}

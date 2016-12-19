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

    @Test public void
    should_return_the_sum_of_two_numbers() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(9, stringCalculator.add("4,5"));
        assertEquals(8, stringCalculator.add("3,5"));
    }

    @Test public void
    should_return_the_sum_of_any_amount_of_numbers() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    }

    private class StringCalculator {
        public int add(String input) {
            if(input.isEmpty()) {
                return 0;
            } else if (input.length() == 1) {
                return valueOf(input);
            }
            String[] numbers = input.split(",");
            int sum = 0;
            for(String number: numbers) {
                sum += valueOf(number);
            }
            return sum;
        }
    }
}

package tdd.xtr;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.valueOf;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    StringCalculator stringCalculator;
    @Before public void
    setup() {
        stringCalculator = new StringCalculator();
    }

    @Test public void
    should_return_zero_for_empty_string() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test public void
    should_return_the_same_number_when_single_number() {
        assertEquals(4, stringCalculator.add("4"));
        assertEquals(5, stringCalculator.add("5"));
    }

    @Test public void
    should_return_the_sum_of_two_numbers() {
        assertEquals(9, stringCalculator.add("4,5"));
        assertEquals(8, stringCalculator.add("3,5"));
    }

    @Test public void
    should_return_the_sum_of_any_amount_of_numbers() {
        assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    }

    private class StringCalculator {
        public int add(String input) {
            if(input.isEmpty()) {
                return 0;
            }
            String[] numbers = extractNumbers(input);

            return getSum(numbers);
        }

        private int getSum(String[] numbers) {
            int sum = 0;
            for(String number: numbers) {
                sum += valueOf(number);
            }
            return sum;
        }

        private String[] extractNumbers(String input) {
            return input.split(",");
        }
    }
}

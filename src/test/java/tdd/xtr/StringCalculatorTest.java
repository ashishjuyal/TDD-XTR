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
    should_return_zero_for_empty_string() throws Exception {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test public void
    should_return_the_same_number_when_single_number() throws Exception {
        assertEquals(4, stringCalculator.add("4"));
        assertEquals(5, stringCalculator.add("5"));
    }

    @Test public void
    should_return_the_sum_of_two_numbers() throws Exception {
        assertEquals(9, stringCalculator.add("4,5"));
        assertEquals(8, stringCalculator.add("3,5"));
    }

    @Test public void
    should_return_the_sum_of_any_amount_of_numbers() throws Exception {
        assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    }

    @Test public void
    should_return_the_sum_of_numbers_delimited_by_newline() throws Exception {
        assertEquals(15, stringCalculator.add("1\n2,3\n4,5"));
    }

    @Test(expected = Exception.class) public void
    should_throw_exception_when_negative_number() throws Exception {
        stringCalculator.add("1\n-2,3");
    }

    private class StringCalculator {
        public int add(String input) throws Exception {
            if(input.isEmpty()) {
                return 0;
            }
            String[] numbers = extractNumbers(input);

            findNegativeNumbers(numbers);

            return getSum(numbers);
        }

        private void findNegativeNumbers(String[] numbers) throws Exception {
            for(String number: numbers) {
                if(valueOf(number) < 0) {
                    throw new Exception();
                }
            }
        }

        private int getSum(String[] numbers) {
            int sum = 0;
            for(String number: numbers) {
                sum += valueOf(number);
            }
            return sum;
        }

        private String[] extractNumbers(String input) {
            return input.split(",|\n");
        }
    }
}

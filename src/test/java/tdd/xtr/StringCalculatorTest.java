package tdd.xtr;

import org.hamcrest.junit.ExpectedException;
import org.junit.Before;
import org.junit.Rule;
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

    @Rule public ExpectedException expectedException = ExpectedException.none();
    @Test public void
    should_throw_exception_when_negative_number_and_return_all_negative_number_in_exception_message() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("-2, -3");
        stringCalculator.add("1\n-2,-3");
    }

}

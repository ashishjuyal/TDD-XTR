package tdd.xtr;

import org.junit.Before;
import org.junit.Test;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    @Before public void
    setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test public void
    should_return_one_for_one() {
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test public void
    should_return_two_for_two() {
        assertEquals("2", fizzBuzz.evaluate(2));
    }

    private class FizzBuzz {
        public String evaluate(int number) {
            return valueOf(number);
        }
    }
}

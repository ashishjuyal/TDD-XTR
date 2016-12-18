package tdd.xtr;

import org.junit.Test;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test public void
    should_return_one_for_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test public void
    should_return_two_for_two() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.evaluate(2));
    }

    private class FizzBuzz {
        public String evaluate(int number) {
            return valueOf(number);
        }
    }
}

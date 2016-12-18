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

    @Test public void
    should_return_Fizz_for_three() {
        assertEquals(FizzBuzz.FIZZ, fizzBuzz.evaluate(3));
    }

    @Test public void
    should_return_Buzz_for_five() {
        assertEquals(FizzBuzz.BUZZ, fizzBuzz.evaluate(5));
    }

    private class FizzBuzz {

        public static final String FIZZ = "Fizz";
        public static final String BUZZ = "Buzz";

        public String evaluate(int number) {
            if(number == 3) {
                return FIZZ;
            } else if(number == 5) {
                return BUZZ;
            }
            return valueOf(number);
        }
    }
}

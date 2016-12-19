package tdd.xtr;

import org.junit.Before;
import org.junit.Test;

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

    @Test public void
    should_return_Fizz_for_six() {
        assertEquals(FizzBuzz.FIZZ, fizzBuzz.evaluate(6));
    }

    @Test public void
    should_return_Buzz_for_ten() {
        assertEquals(FizzBuzz.BUZZ, fizzBuzz.evaluate(10));
    }

    @Test public void
    should_return_FizzBuzz_for_fifteen() {
        assertEquals(FizzBuzz.FIZZ_BUZZ, fizzBuzz.evaluate(15));
    }

    @Test public void
    should_return_FizzBuzz_for_thirty() {
        assertEquals(FizzBuzz.FIZZ_BUZZ, fizzBuzz.evaluate(30));
    }

}

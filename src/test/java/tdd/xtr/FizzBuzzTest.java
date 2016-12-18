package tdd.xtr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test public void
    should_return_one_for_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    private class FizzBuzz {
        public String evaluate(int number) {
            return null;
        }
    }
}

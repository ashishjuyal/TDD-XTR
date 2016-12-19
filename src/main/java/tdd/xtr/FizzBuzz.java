package tdd.xtr;

import static java.lang.String.valueOf;

class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final int FACTOR_OF_FIZZ_BUZZ = 15;
    public static final int FACTOR_OF_FIZZ = 3;
    public static final int FACTOR_OF_BUZZ = 5;
    private int number;

    public String evaluate(int number) {
        this.number = number;
        if (isDivisibleBy(FACTOR_OF_FIZZ_BUZZ)) {
            return FIZZ_BUZZ;
        } else if (isDivisibleBy(FACTOR_OF_FIZZ)) {
            return FIZZ;
        } else if (isDivisibleBy(FACTOR_OF_BUZZ)) {
            return BUZZ;
        }
        return valueOf(number);
    }

    private boolean isDivisibleBy(int factorOf) {
        return this.number % factorOf == 0;
    }
}

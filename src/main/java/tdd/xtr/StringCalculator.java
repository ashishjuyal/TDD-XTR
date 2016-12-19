package tdd.xtr;

import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.valueOf;
import static java.util.stream.Collectors.toList;

class StringCalculator {
    public int add(String input) throws Exception {
        if (input.isEmpty()) {
            return 0;
        }

        List<Integer> numbers = extractNumbers(input);

        findNegativeNumbers(numbers);

        return getSum(numbers);
    }

    private void findNegativeNumbers(List<Integer> extractedNumbers) throws Exception {
        List<Integer> collect = extractedNumbers.stream().filter(num -> num < 0).collect(toList());

        if (!collect.isEmpty()) {
            throw new Exception(collect.toString());
        }
    }

    private int getSum(List<Integer> extractedNumbers) {
        return extractedNumbers.stream().reduce((p, n) -> p + n).get();
    }

    private List<Integer> extractNumbers(String input) {
        return Arrays.stream(input.split(",|\n")).map(Integer::valueOf).collect(toList());
    }
}

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

        String[] numbers = extractNumbers(input);

        List<Integer> extractedNumbers = extractNumbersAsIntegerList(input);

        findNegativeNumbers(numbers, extractedNumbers);

        return getSum(numbers, extractedNumbers);
    }

    private void findNegativeNumbers(String[] numbers, List<Integer> extractedNumbers) throws Exception {
        List<String> collect = Arrays.stream(numbers)
                .filter(num -> valueOf(num) < 0)
                .collect(toList());

        if (!collect.isEmpty()) {
            throw new Exception(collect.toString());
        }
    }

    private int getSum(String[] numbers, List<Integer> extractedNumbers) {
        return Arrays.stream(numbers)
                .map(Integer::valueOf)
                .reduce((p, n) -> p + n)
                .get();
    }

    private String[] extractNumbers(String input) {
        return input.split(",|\n");
    }

    private List<Integer> extractNumbersAsIntegerList(String input) {
        return Arrays.stream(input.split(",|\n")).map(Integer::valueOf).collect(toList());
    }
}

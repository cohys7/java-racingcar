package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    private final List<Number> numbers;

    public Numbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public static Numbers create(String[] tokens) {
        return new Numbers(Arrays.stream(tokens).map(Number::parse).collect(Collectors.toList()));
    }

    public int sum() {
        Number sum = new Number(0);
        for (Number number : numbers) {
            sum = sum.add(number);
        }
        return sum.getNumber();
    }
}

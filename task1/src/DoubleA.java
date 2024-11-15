import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class DoubleA {
    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        Function<Integer, Integer> doubleFunction = number -> number * 2;

        return numbers.stream()
                .map(doubleFunction)
                .collect(Collectors.toList());
    }
}

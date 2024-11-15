import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static List<Integer> Filter(List<Integer> numbers) {
        Predicate<Integer> isPossile = number -> number>0;


        return numbers.stream()
                .filter(isPossile)
                .collect(Collectors.toList());
    }
}

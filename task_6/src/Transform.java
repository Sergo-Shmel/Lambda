import java.util.List;
import java.util.function.Function;

public class Transform {
    public static List<Integer> numberx3(List<Integer> numbers) {

        Function<Integer,Integer> triple = number -> number * 3;

        return numbers.stream()
                .map(triple)
                .toList();
    }
}

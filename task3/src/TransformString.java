import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransformString {
    public static List<Integer> convertToLengths(List<String> strings) {

        Function<String, Integer> lengthFunction = String::length;

        return strings.stream()
                .map(lengthFunction)
                .collect(Collectors.toList());
    }
}

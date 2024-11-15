import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cheking {
    public static List<String> chekingSymbols(List<String> strings) {
        Predicate<String> symbolCheck = string -> string.length() > 5;

        return strings.stream()
                .filter(symbolCheck)
                .collect(Collectors.toList());
    }
}

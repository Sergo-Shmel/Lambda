import java.util.List;
import java.util.stream.Collectors;

public class ConectingString {
    public static String conecting(List<String> strings, String delimiter) {
        return strings.stream().
                collect(Collectors.joining(delimiter));
    }
}

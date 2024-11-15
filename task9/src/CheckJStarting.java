import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CheckJStarting {
    public static long jstarting (List<String> strings,char chars){
        Predicate<String> jstarting = string ->  string.toLowerCase().startsWith(String.valueOf(chars).toLowerCase());

        return strings.stream()
                .filter(jstarting)
                .count();
    }
}

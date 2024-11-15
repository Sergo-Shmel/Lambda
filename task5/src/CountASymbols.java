import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountASymbols {
    public static List<Integer> counting (List<String> words){
        Function<String, Integer> CountAFunction = word -> (int) word.chars().filter(c -> c == 'a').count();

        return words.stream()
                .map(CountAFunction)
                .collect(Collectors.toList());
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumber {
    public static List<Integer> numbers(int amount){
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

        return Stream.generate(randomNumberSupplier)
                .limit(amount)
                .collect(Collectors.toList());
    }
}

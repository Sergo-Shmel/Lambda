import java.util.Arrays;
import java.util.List;

//Задача 3: Преобразование списка строк в их длины
//Дан список строк. Используйте лямбда-выражение для преобразования каждой строки в её длину и
// сохраните результат в новом списке.
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        List<Integer> lenght = TransformString.convertToLengths(strings);

        System.out.println(lenght);
    }
}

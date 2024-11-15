import java.util.Arrays;
import java.util.List;

//Задача 5: Подсчёт символов 'a'
//Дан список слов. Напишите лямбда-выражение, которое подсчитывает
// количество символов 'a' в каждом слове и выводит результат.
public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");

        List<Integer> Count = CountASymbols.counting(words);

        System.out.println(Count);
    }
}

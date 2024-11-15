import java.util.Arrays;
import java.util.List;

//Задача 10: Объединение строк с разделителем
//Дан список строк. Создайте лямбда-выражение, которое объединяет все строки из
// списка в одну строку с разделителем ", ". Например, ["apple", "banana", "cherry"]
// должно преобразоваться в "apple, banana, cherry".
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        System.out.println(ConectingString.conecting(strings, ", "));
    }
}

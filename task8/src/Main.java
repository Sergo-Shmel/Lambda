import java.util.Arrays;
import java.util.List;

//Задача 8: Проверка на палиндром
//Создайте лямбда-выражение, которое проверяет, является ли строка палиндромом
//(читается одинаково слева направо и справа налево). Примените его к списку строк и выведите только палиндромы.
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apa", "dod", "dedwdij");

        System.out.println(PalindromCheck.palindrom(strings));

    }
}

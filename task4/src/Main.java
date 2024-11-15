import java.util.Arrays;
import java.util.List;

//Задача 4: Поиск слов по длине
//Дан список слов. Напишите лямбда-выражение, которое проверяет,
//содержит ли слово больше пяти символов.
// Используйте его для фильтрации и создания нового списка только с длинными словами.
public class Main {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("adeiwfei", "bfe", "cffffw");

        List<String> longString = Cheking.chekingSymbols(string);

        System.out.println(longString);
    }
}

import java.util.Arrays;
import java.util.List;

//Задача 2: Фильтр положительных чисел
//Создайте лямбда-выражение для фильтрации положительных чисел из списка.
//Используйте его вместе с методом filter из Stream API, чтобы оставить только положительные числа в списке.
public class Main {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3);

        List <Integer> positiveNumbers = Filter.Filter(numbers);

        System.out.println(positiveNumbers);
    }
}

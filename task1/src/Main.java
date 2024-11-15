import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

//Задача 1: Удвоение чисел
//Создайте лямбда-выражение, которое принимает число и возвращает его удвоенное значение.
// Затем примените это выражение к списку чисел и выведите результат.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubledNumbers = DoubleA.doubleNumbers(numbers);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Удвоенный список: " + doubledNumbers);
    }
}

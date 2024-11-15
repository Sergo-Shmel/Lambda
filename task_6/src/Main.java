import java.util.Arrays;
import java.util.List;

//Задача 6: Применение операции к каждому элементу
//Создайте лямбда-выражение, которое выводит каждый элемент списка на консоль, умножая его на 3 перед выводом.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,2312,4);

        List<Integer> newNumbers = Transform.numberx3(numbers);
        System.out.println(newNumbers);
    }
}

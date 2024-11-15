import java.util.Arrays;
import java.util.List;

//Задача 9: Подсчёт строк, начинающихся с определённой буквы
//Напишите лямбда-выражение, которое считает, сколько строк в списке начинаются с
// определённой буквы, например, 'J'.
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("asffa","Jdads","sdsdj","jsdas","sdasdj");
        System.out.println(CheckJStarting.jstarting(strings, 'J'));
    }
}

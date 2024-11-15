import java.util.List;
import java.util.function.Predicate;

public class PalindromCheck {
     public static List<String> palindrom(List<String> words) {

         Predicate<String> isPalindrom = word -> {
             String reversedWord = new StringBuilder(word).reverse().toString();
             return word.equals(reversedWord);
         } ;

         return words.stream().
                 filter(isPalindrom).
                 toList();
     }
}

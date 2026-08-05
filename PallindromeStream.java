
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PallindromeStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Level", "noon", "racecar", "java", "hello", "madam");

        List<String> palindromes = words.stream()
                                    .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                                    .collect(Collectors.toList());

        System.out.println("Palindromes: " + palindromes);
    }
}


import java.util.List;
import java.util.stream.Collectors;

public class VowelsAndConsonantsString {
    public static void main(String[] args) {
        String str = "Hello World";
        
        List<Character> consonants = str.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> "AEIOUaeiou".indexOf(c) == -1 && " ".indexOf(c) == -1)
                    .collect(Collectors.toList());

        List<Character> vowels = str.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                    .collect(Collectors.toList());

        System.out.println("consonants in the string: " + consonants);
        System.out.println("Number of consonants: " + consonants.size());

        System.out.println("vowels in the string: " + vowels);
        System.out.println("Number of vowels: " + vowels.size());
    }
}

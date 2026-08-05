import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeating {
    public static void main(String[] args) {
        String input = "akashpandey";

        Map<Character, Long> freqMap = input.chars().mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
            ));

        Optional<Character> secondNonRepeating = freqMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .skip(1)
            .findFirst();

        secondNonRepeating.ifPresent(System.out::println);
    }
}

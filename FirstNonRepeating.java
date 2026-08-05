
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String input = "1122334455136";

        Map<Character, Long> freqMap = input.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
            ));

        Optional<Character> firstNonRepeating = freqMap.entrySet().stream()
            .filter(i -> i.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();

        firstNonRepeating.ifPresent(System.out::println);
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class NonRepeating {
    public static void main(String[] args) {
        String input = "akashpandey";

        Map<Character, Long> freqMap = input.chars().mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
            ));

        List<Character> nonRepeatingElements = freqMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

            System.out.println(freqMap);

        System.out.println(nonRepeatingElements);
    }
}
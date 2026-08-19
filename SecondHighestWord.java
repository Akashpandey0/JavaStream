import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestWord {
    public static void main(String[] args) {
        String str = "hello hello hello world world";

        Map<String, Long> wordCounts = Stream.of(str.split(" "))
        .collect(Collectors.groupingBy(
            Function.identity()
            ,Collectors.counting()));

        String secondHighestWord = wordCounts.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .skip(1)
                    .findFirst()
                    .map(Map.Entry::getKey)
                    .orElse(null);
        
        System.out.println("Second highest word: " + secondHighestWord);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,4,6);

        Map<Integer, Long> freq = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        List<Integer> removeDuplicate = freq.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey()).toList();

        System.out.println(removeDuplicate);

    }
}
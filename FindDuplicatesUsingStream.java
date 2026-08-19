
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,1,1,2,4,5,5,6,7,6);

        // 1st approach using indexOf and lastIndexOf
        List<Integer> duplicates = numbers.stream()
                .filter(n -> numbers.indexOf(n) != numbers.lastIndexOf(n))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("1st approach: "+duplicates);

        // 2nd approach using entrySet()
        List<Integer> duplicates2 = numbers.stream()
                .collect(Collectors.groupingBy(x -> x,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("2nd approach: "+duplicates2);

        //3rd approach using Lambda Expression
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates3 = new HashSet<>();

        numbers.forEach(n -> {
            if(seen.contains(n)){
                duplicates3.add(n);
            }
            seen.add(n);
            });

        System.out.println("3rd approach: "+duplicates3);
    }
}

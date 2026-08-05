
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> odd = numbers.stream().filter(n -> n % 2 != 0).toList();

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        //2nd approach - using one variable
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        
        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));

        //3rd approach - using grouping by
        Map<String, List<Integer>> grouped = numbers.stream()
            .collect(Collectors.groupingBy(n -> (n % 2 == 0) ? "Even" : "Odd"));

        System.out.println("Even numbers: " + grouped.get("Even"));
        System.out.println("Odd numbers: " + grouped.get("Odd"));
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniquePairs {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int target = 10;

        // 1st Approach - Using Streams
        System.out.println("1st Approach:");
        Set<String> uniquePairs = num.stream()
            .flatMap(a -> num.stream()
                .filter(b -> a < b && a + b == target)
                .map(b -> ( a + ", " + b )))
            .collect(Collectors.toSet());

        uniquePairs.forEach(System.out::println);

        //2nd approach - Using Streams with IntStream and mapToObj

        List<String> uniqueSetPairs = IntStream.range(0, num.size())
                            .boxed()
                            .flatMap(a -> IntStream.range(1, num.size())
                                .filter(b -> a < b && a + b == target)
                                .mapToObj(b -> "(" + a + ", " + b + ")")
                            ).collect(Collectors.toList());

        System.out.println("\n2nd Approach with IntStream:");
        uniqueSetPairs.forEach(System.out::println);
        
        // 2nd Approach - Nested Loops
        Set<String> uniquePairs2 = new HashSet<>();
        for (int i = 0; i < num.size(); i++) {
            for(int j = i+1; j < num.size(); j++) {
                if(num.get(i) + num.get(j) == target) {
                    uniquePairs2.add(num.get(i) + ", " + num.get(j));
                }
            }
        }
        
        System.out.println("\n2nd Approach:");
        uniquePairs2.forEach(System.out::println);

        // 3rd Approach - Two Pointer Technique. This requires sorted list
        System.out.println("\n3rd Approach:");
        int j = num.size() - 1;
        for (int i = 0; i < j; ) {
            int sum = num.get(i) + num.get(j);
            if (sum == target) {
                System.out.println(num.get(i) + ", " + num.get(j));
                i++;
                j--;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        // 4th approach - Using HashSet

        System.out.println("\n4th Approach:");
        Set<Integer> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for(int num1: num) {
            int complement = target - num1;
            if(seen.contains(complement)) {
                int a = Math.min(num1,complement);
                int b = Math.max(num1,complement);
                result.add(a + ", " + b);
            }
            seen.add(num1);
        }

        result.forEach(System.out::println);
    }
}

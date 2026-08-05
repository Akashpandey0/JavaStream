
import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int max = numbers.stream()
            .max(Integer::compare)
            .get();

        int min = numbers.stream()
            .min(Integer::compare)
            .get();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

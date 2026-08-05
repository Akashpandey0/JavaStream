
import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        long count = numbers.stream().count();
        System.out.println("Count of elements in a list: " + count);
    }
}

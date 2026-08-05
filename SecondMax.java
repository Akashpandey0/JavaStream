
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50,40, 20, 50, 30);

        int secondMax = list.stream()
                        .distinct()
                        .sorted((a,b) -> b-a)
                        .skip(1)
                        .findFirst()
                        .get();

        System.out.println("Without Comparator Second max: " + secondMax);

        int secondMax1 = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("With Comparator Second max: " + secondMax1);
    }
}

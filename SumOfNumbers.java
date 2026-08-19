
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        int sum = numbers.stream().mapToInt(n->(int)n).sum();
        System.out.println("Sum of numbers: " + sum);

        //using reduce
        int sum2 = numbers.stream().reduce(0, (a,b)->a+b);
        System.out.println("Sum of numbers using reduce: " + sum2);
    }
}

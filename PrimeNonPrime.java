
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNonPrime {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> result = numbers.stream()
            .collect(Collectors.partitioningBy(PrimeNonPrime::isPrime));

        System.out.println("Prime numbers: " + result.get(true));
        System.out.println("Non-prime numbers: " + result.get(false));
    }

    public static boolean isPrime(int number) {
        if(number <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(number))
            .allMatch(i -> number % i != 0);
    }
}

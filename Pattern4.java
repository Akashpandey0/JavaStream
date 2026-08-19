
import java.util.stream.IntStream;

public class Pattern4 {
    // Butterfly pattern
    public static void main(String[] args) {
        IntStream.rangeClosed(1,5)
        .forEach(i -> System.out.println("*".repeat(i) + " ".repeat(2 * (5 - i) + 1) + "*".repeat(i)));

        IntStream.rangeClosed(1,5)
        .forEach(i -> System.out.println("*".repeat(5-i) + " ".repeat(2 * i + 1) + "*".repeat(5-i)));
    }
}

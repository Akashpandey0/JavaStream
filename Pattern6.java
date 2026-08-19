
import java.util.stream.IntStream;

public class Pattern6 {
    // Equilateral triangle
    public static void main(String[] args) {
        IntStream.rangeClosed(1,5)
        .forEach(i -> System.out.println(" ".repeat(5 - i) + "*".repeat(2 * i - 1)));
    }
}

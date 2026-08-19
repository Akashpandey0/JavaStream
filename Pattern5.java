import java.util.stream.IntStream;

public class Pattern5 {
    // Diamond pattern
    public static void main(String[] args) {
        IntStream.rangeClosed(1,5)
        .forEach(i -> System.out.println(" ".repeat(5 -i) + "*".repeat(2 * i - 1)));
        IntStream.rangeClosed(1,4)
        .forEach(i -> System.out.println(" ".repeat(i) + "*".repeat(2 * (5 -i) - 1)));
    }
}

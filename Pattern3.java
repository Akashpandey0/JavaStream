
import java.util.stream.IntStream;

public class Pattern3 {
    // twin triangle
    public static void main(String[] args) {
        IntStream.rangeClosed(1,5).forEach(i -> System.out.println("*".repeat(i) +" ".repeat(2 * (5 - i) + 1) + "*".repeat(i)));
    }
}

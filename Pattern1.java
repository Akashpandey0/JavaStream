import java.util.stream.IntStream;

public class Pattern1 {

    // right angle triangle
    public static void main(String[] args) {
        IntStream.rangeClosed(1,5)
        .forEach(i -> System.out.println("*".repeat(i)));
    }
}

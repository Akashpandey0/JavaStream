
import java.util.stream.IntStream;

public class Pattern7 {
    //square pattern
    public static void main(String[] args) {
        IntStream.rangeClosed(1,5)
        .forEach(i -> System.out.println("*".repeat(5)));
    }
}

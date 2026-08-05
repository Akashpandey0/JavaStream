// print natural numbers using stream
import java.util.stream.Stream;
public class PrintNaturalNumber {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1)
              .limit(10)
              .forEach(System.out::println);
    }
}

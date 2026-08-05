import java.util.Arrays;

public class NameEndsWithE {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        // for(String name: names) {
        //     if(name.endsWith("e")) {
        //         System.out.println(name);
        //     }
        // }

        //using streams
        Arrays.stream(names)
            .filter(name -> name.endsWith("e"))
            .forEach(System.out::println);
    }
}

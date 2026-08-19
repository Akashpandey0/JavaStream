
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLength {
    public static void main(String[] args) {
        List<String> str =  Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        //use groupingBy to group strings by their lengths
        Map<Integer,List<String>> groupedByLength = str.stream()
            .collect(Collectors.groupingBy(String::length));

        //print the result
        System.out.println(groupedByLength);
    }
}

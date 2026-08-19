
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Akash Pandey";
        String [] words = str.split(" ");

        String reversed = Arrays.stream(words)
            .map(word -> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));
        
        System.out.println(reversed);
    }
}


import java.util.Arrays;
import java.util.Comparator;

public class SmallestWord {
    public static void main(String[] args) {
        String str = "I am a good boy in a school";

        String smallestWord = Arrays.stream(str.split(" "))
            .min(Comparator.comparingInt(String::length))
            .orElse(null);

        System.out.println(smallestWord);
    }
}


import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5};
        int n = Arrays.stream(arr).max().orElse(0);

        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();

        int missingElement = expectedSum - actualSum;
        System.out.println("The missing element is: " + missingElement);
    }
}
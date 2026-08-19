
import java.util.Arrays;
import java.util.Optional;

public class SingleElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,1,4,21};

        int singleElement = Arrays.stream(arr).boxed()
                                        .reduce(0,(a,b) -> a ^ b);

        if(singleElement != 0) {
            System.out.println(singleElement);
        } else {
            System.out.println("No single element found");
        }
    }
}

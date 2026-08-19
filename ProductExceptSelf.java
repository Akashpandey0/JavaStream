
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int [] arr) {
        int [] result = new int[arr.length];
        int left = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] = left;
            left *= arr[i];
        }

        int right = 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= arr[i];

        }


        return result;
    }
}

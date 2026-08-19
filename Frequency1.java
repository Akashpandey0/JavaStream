import java.util.*;
public class Frequency1 {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,1,2,3,4,1,2,1};
        int max = Arrays.stream(arr).max().getAsInt();
        int [] freq = new int[max+1];

        for(int num: arr) {
            freq[num]++;
        }

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }

    }
}

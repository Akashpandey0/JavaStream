
import java.util.List;
import java.util.ArrayList;

public class MajorityElement2 {
    public static void main(String[] args) {
        int arr [] = {1,2,2,1,3,4,4,2,2,3,4,4,3,3,4,4};
        
        System.out.println("Majority Element in the array is: " + findMajorityElement(arr));
    }

    public static List<Integer> findMajorityElement(int [] arr) {
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        // Phase1 Voting
        for(int num: arr) {
            if(count1 > 0 && num == candidate1) count1++;
            else if(count2 > 0 && num == candidate2) count2++;
            else if(count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        //Phase 2: Verification

        int n = arr.length;
        int threshold = n/3;
        int freq1 = 0, freq2 = 0;

        for(int num: arr) {
            if(num == candidate1) freq1++;
            else if(num == candidate2) freq2++;
        }

        List<Integer> result = new ArrayList<>();
        if(freq1 > threshold) result.add(candidate1);
        if(freq2 > threshold) result.add(candidate2);
        
        return result;
    }
}

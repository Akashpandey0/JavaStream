import java.util.Arrays;

public class FindTheLargestAlmostMissingInteger {
    public static void main(String[] args) {
        int [] nums = {3,9,2,1,7};

        int k = 3;
        System.out.println("The largest almost missing integer is: " + findLargestAlmostMissingInteger(nums, k));
    }

    public static int findLargestAlmostMissingInteger(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int [] freq = new int[max+1];
        for(int num: nums) {
            freq[num]++;
        }

        int ans = -1;

        if( k == 1) {
            for(int num: nums) {
                if(freq[num] == 1) ans = Math.max(ans, num);
            }
            return ans;
        }

        if(k == nums.length - 1) {
            ans = max;
            return ans;
        }

        if(k > 1 && k < nums.length) {
            if(freq[nums[0]] == 1) ans = Math.max(ans, nums[0]);
            if(freq[nums[nums.length - 1]] == 1) ans = Math.max(ans, nums[nums.length - 1]);

            return ans;
        }

        return -1;
    }
}
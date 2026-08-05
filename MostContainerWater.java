public class MostContainerWater {
    public static void main(String[] args) {
        int heights [] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Maximum water container can contain: " + totalWater(heights));
    }

    public static int totalWater(int [] heights) {
        int left = 0;
        int right = heights.length();
        int best = 0;

        while(left < right) {
            int h = Math.min(heights[left], heights[right]);
            
            best = Math.max(best, h * (right - left));

            if(heights[left] < heights[right]) left++;
            else right--;
        }
        
        return best;
        
    }
}
public class FindLargestInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,2,1};

        int right = arr.length - 1;
        int left = 0;

        int mid = left + (right - left) / 2;

        while(left < right) {
            if(arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else if(arr[mid] > arr[mid + 1]) {
                right = mid;
            }
            mid = left + (right - left) / 2;
        }

        System.out.println("The largest element is: " + arr[mid]);
    }
}

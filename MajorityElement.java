class MajorityElement {
    public static void main(String[] args) {
        int arr [] = {1,2,2,1,3,2,2,3,3,3};
        
        System.out.println("Majority Element in the array is: " + findMajorityElement(arr));
    }

    public static int findMajorityElement(int [] arr) {
        int count = 0;
        int candidate = 0;

        for(int num: arr) {
            if(count == 0) {
                candidate = num;
            }

            if(num == candidate) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return candidate;
    }
}
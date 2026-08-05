public class MoveZeroToTheEnd {
    public static void main(String[] args) {
        int [] arr = {1, 0, 8, 0, 3, 0, 7, 0, 5};

        System.out.println("Before Moving Zeroes to the end:");
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int index = 0;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while(index < arr.length) {
            arr[index++] = 0;
        }
        
        System.out.println("After Moving Zeroes to the end:");
        for(int i : arr) {
            System.out.print(i+" ");
        }


    }
}

public class FindFirstMissingPositive {
    public static void main(String[] args) {
        int [] num = {2,3,1,-1,4,-2};

        System.out.println(firstMissingPositive(num));
    }

    public static int firstMissingPositive(int [] num){
        int n = num.length;

        int i = 0;
        while(i < n) {
            if(num[i] > 0 && num[i] <= n && num[i] != num[num[i] - 1]) {
                int temp = num[num[i] - 1];
                num[num[i] - 1] = num[i];
                num[i] = temp;
            }
            else i++;
        }

        for(i = 0; i < n; i++) {
            if(num[i] != i + 1) return i + 1;
        }

        return n + 1;
    }
}

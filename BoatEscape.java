
import java.util.Arrays;

public class BoatEscape {
    public static void main(String[] args) {
        int [] peopleWeight = {1,2,1,3,2};
        int limit = 3;

        System.out.println(numRescueBoats(peopleWeight,limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int ans = 0;
        int i = 0, j = people.length - 1;
        while(i <= j) {
            ans++;
            if(people[i] + people[j] <= limit) i++;

            j--;
        }

        return ans;
    }
}

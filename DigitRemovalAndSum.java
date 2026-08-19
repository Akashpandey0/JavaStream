
import java.util.Scanner;

public class DigitRemovalAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Enter a digit to remove: ");
        int remove = sc.nextInt();

        boolean removed = false;
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;

            if(digit == remove && !removed) {
                removed = true;
            } else {
                sum += digit;
            }

            num /= 10;
        }

        System.out.println("The sum of the digits after removing " + remove + " is: " + sum);
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // GCD g = new GCD();
        // System.out.println(gcd(a, b));
        // System.out.println(lcm(a, b));

        int gcd = Arrays.stream(new int[]{a, b}).reduce(GCD::gcd).getAsInt();

        System.out.println("GCD: " + gcd);
    }

    public static int gcd(int a, int b) {
        while(b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


}

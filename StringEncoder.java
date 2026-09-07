import java.util.Scanner;
import java.util.stream.Collectors;

public class StringEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String message = sc.nextLine();

        int length = message.length();

        if(length <= 4){
            System.out.println("The length of the string should be greater than 4");
            return;
        }
        System.out.println(length);

        System.out.println("Encoded message: " + StringEncoder.encode(length, message));
        sc.close();
    }

    public static String encode(int length,String message) {
        String encodeMsg = message.chars()
                            .map(s -> s - length)
                            .mapToObj(s -> String.valueOf((char) s))
                            .collect(Collectors.joining());
        return encodeMsg;
    }
}
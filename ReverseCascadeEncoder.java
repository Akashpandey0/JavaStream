import java.util.Scanner;

public class ReverseCascadeEncoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(!isValidInput(str)) {
            System.out.println("Invalid Input");
            return;
        }

        String[] words = str.trim().split(" ");

        if(words.length < 2) {
            System.out.println("Invalid Input length");
            return;
        }

        String encodedStr = encodeString(str);
        System.out.println(encodedStr);
    }

    public static boolean isValidInput(String str) {
        return str.matches("^[A-Za-z ]+$");

    }

    public static String encodeString(String str) {
        StringBuilder sb = new StringBuilder();
        String [] words = str.trim().split(" ");

        for(String word: words) {
            String reversedWord = new StringBuilder(word).reverse().toString();

            for(int i = 0; i < reversedWord.length(); i++) {
                char ch = reversedWord.charAt(i);
                if(Character.isUpperCase(ch)) {
                    sb.append((char)((ch + i - 'A') % 26 + 'A'));
                } else {
                    sb.append((char)((ch + i - 'a') % 26 + 'a'));
                }
            }
            sb.append(word.length());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

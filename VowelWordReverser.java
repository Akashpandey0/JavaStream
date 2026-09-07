
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VowelWordReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        sc.close();

            if(!isValidSentence(sentence)){
                System.out.println("The sentence is invalid.");
                return;
            }

        String output = processSentence(sentence);
        System.out.println(output);
    }

    public static boolean isValidSentence(String sentence) {
        return sentence.matches("^[a-zA-Z ]+$");
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static String processSentence(String sentence) {
        return Arrays.stream(sentence.trim().split("\\s+"))
                .map(word -> {
                    if(!word.isEmpty() && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                        return new StringBuilder(word).reverse().toString();
                    }
                    return word;
                }).collect(Collectors.joining(" "));
    }
}

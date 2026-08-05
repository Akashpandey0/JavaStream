import java.util.*;
import java.util.stream.*;

public class CharacterShiftingStream {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Original string: " + str);

        String shiftedStr = shiftWords(str);

        System.out.println("Shifted string: " + shiftedStr);
    }

    public static String shiftWords(String str) {
        
        return Arrays.stream(str.trim().split(" "))
                .map(word -> {
                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i < word.length(); i++) {
                        sb.append(shiftCharacter(word.charAt(i), word.length(), i));
                    }
                    return word.length() + sb.toString();
                }).collect(Collectors.joining(" "));
    }

    public static char shiftCharacter(char ch, int length, int index) {
        int shiftedIndex = length - 1 - index;

        if(Character.isUpperCase(ch)) {
            return (char)((ch + shiftedIndex - 'A') %26 + 'A');
        } else {
            return (char)((ch + shiftedIndex - 'a')% 26 + 'a');
        }
    }
}

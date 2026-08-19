import java.util.HashSet;
import java.util.Set;

public class RemoveAllCommon {
    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "computer";
        StringBuilder sb = new StringBuilder();

        System.out.println("Using Set: "+ removeCommon(str1, str2));
        

        
        for(int i = 0; i < str2.length(); i++) {
            int flag = 0;
            for(int j = 0; j < str1.length(); j++) {
                if(str2.charAt(i) == str1.charAt(j)) {
                    flag = 1;
                    break;
            }
        }
            if(flag == 0) {
                sb.append(str2.charAt(i));
            }
        }

        System.out.println("Using Brute Force: " +sb);
    }

    public static String removeCommon(String str1, String str2) {
        Set<Character> seen = new HashSet<>();

        for(char ch: str1.toCharArray()) {
            seen.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch: str2.toCharArray()) {
            if(!seen.contains(ch)) {
                sb.append(ch);
            
            }
        }
        
        return sb.toString();
    }
}

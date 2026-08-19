public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abbccddeeeedcba";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {
            int len = sb.length();

            if(len > 0 && sb.charAt(len-1) == ch) {
                sb.deleteCharAt(len-1);
            } else {
                sb.append(ch);
            }
        }



        return sb.toString();
    }
}

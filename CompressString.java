public class CompressString {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(compressString(s));
    }

    public static String compressString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 1; i <= s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }

            if(s.charAt(i) != s.charAt(i-1) || i == s.length() - 1) {
                sb.append(s.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }


        return sb.toString();
    }
}

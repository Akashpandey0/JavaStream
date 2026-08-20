public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()) {
            if(sb.length() > 0 && ch == '*'){
                sb.deleteCharAt(sb.length() - 1);
            }
            else {
                sb.append(ch);
            }
        }

        return sb.toString().trim();
    }
}

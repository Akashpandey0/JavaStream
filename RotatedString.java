public class RotatedString {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";

        if(str1.length() != str2.length()) {
            System.out.println("Not Rotated");
            return;
        }

        String temp = str1 + str1;

        if(temp.contains(str2)) {
            System.out.println("Rotated");
        } else {
            System.out.println("Not Rotated");
        }
    }
}

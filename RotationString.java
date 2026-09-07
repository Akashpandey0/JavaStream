public class RotationString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdad";

        if(s1.length() != s2.length()) {
            System.out.println("Not a rotation");
            return;
        }
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        String concatenate = s1 + s1;

        return concatenate.contains(s2);
    }
}

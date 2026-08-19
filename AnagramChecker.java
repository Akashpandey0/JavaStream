import java.util.stream.Collectors;
class AnagramChecker {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        String a = str1.toLowerCase();
        String b = str2.toLowerCase();

        String sortedA = a.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

        String sortedB = b.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

        return sortedA.equals(sortedB);
    }
}
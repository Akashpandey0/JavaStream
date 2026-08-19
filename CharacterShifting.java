public class CharacterShifting {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Original string: " + str);

        String shiftedStr = shiftWords(str);

        System.out.println("Shifted string: " + shiftedStr);
    }

    public static String shiftWords(String str) {
        String [] words = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word: words) {
            sb.append(word.length());
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int shiftedIndex = (word.length() - 1 - i);
                if(Character.isUpperCase(c)) {
                    sb.append((char)((c + shiftedIndex - 'A') %26 + 'A'));
                } else {
                    sb.append((char)((c + shiftedIndex - 'a')% 26 + 'a'));
                }
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}

public class ZigZagWordCipher {
    public static void main(String[] args) {
        String str = "Alpha Bravo";

        if(!str.matches("^[A-Za-z ]+$")) {
            System.out.println("Invalid Input");
            return;
        }

        String [] words = str.trim().split(" ");

        if(words.length < 2) {
            System.out.println("Invalid Input");
            return;
        }

        String shiftStr = characterShifting(str);
        System.out.println(shiftStr);

    }

    public static String characterShifting(String str) {
        StringBuilder sb = new StringBuilder();
        String [] words = str.trim().split(" ");
        int c = 0;

        for(String word: words) {
            sb.append(++c);
            for(int i = 0; i < word.length(); i++) {
                
                if(i % 2 == 0) {
                    sb.append((char) ((word.charAt(i) + 1 - (Character.isUpperCase(word.charAt(i)) ? 'A' : 'a')) % 26 + (Character.isUpperCase(word.charAt(i)) ? 'A' : 'a')));
                } else {
                    sb.append((char) ((word.charAt(i) - 1 - (Character.isUpperCase(word.charAt(i)) ? 'A' : 'a')) % 26 + (Character.isUpperCase(word.charAt(i)) ? 'A' : 'a')));
                }
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}

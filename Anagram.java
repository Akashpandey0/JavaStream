public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Strings are anagram: " + Anagram.anagram(str1, str2));
    }

    public static boolean anagram(String str1, String str2) {
        if(str1.length()!=str2.length()) {
            return false;
        }

        int [] arr = new int[26];

        for(int i = 0; i < str1.length(); i++) {
            int index1 = (char)str1.charAt(i) - 97;
            arr[index1] =  arr[index1] + 1;
            int index2 = (char)str2.charAt(i) - 97;
            arr[index2] = arr[index2] - 1;
        }

        for(int value:arr){
            if(value!=0){
                return false;
        }
    }
        return true;
    }
}

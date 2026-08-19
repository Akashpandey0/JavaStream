public class StringToUppercase {
    public static void main(String[] args) {
        String str = "hello world";

        String upperStr = str.chars()
                             .mapToObj(c -> (char) c)
                             .map(Character::toUpperCase)
                             .collect(StringBuilder::new,
                                      StringBuilder::append,
                                      StringBuilder::append)
                             .toString();
        System.out.println(upperStr);
    }
}


import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "akash.1@gmail.com";
        String regex = "^[a-zA-Z0-9.]+@[a-z]+.[a-z]{2,}$";
        boolean isValid = Pattern.matches(regex, email);
        System.out.println(isValid);
    }
}

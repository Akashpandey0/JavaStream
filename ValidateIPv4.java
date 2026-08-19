public class ValidateIPv4 {
    public static boolean isValidIPv4(String ip) {
        String [] parts = ip.split("\\.");

        if(parts.length != 4) return false;

        for(String part: parts) {
            // if(part.length() == 0) return false;

            for(char ch: part.toCharArray()) {
                if(!Character.isDigit(ch)) return false;
            }
            int num = Integer.parseInt(part);
            if(num < 0 || num > 255) return false;
        }

            return true;
    }
    public static void main(String[] args) {
        String inputs []= {
             "123.111.12.k",
             "22.0.330.0",
             "1.0.1.250",
             "1.0.0.0.1"
        };

        for(String ip: inputs) {
            System.out.println(isValidIPv4(ip));
        }
    }
}

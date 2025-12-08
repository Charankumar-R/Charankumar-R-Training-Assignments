import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegexDemo {
    public static void main(String[] args) {

        String regex = "^(\\d{3}|\\+\\d)-\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        String num1 = "001-765-989-3421";
        String num2 = "+1-456-765-9345";
        String num3 = "123-45-6789-0000"; 

        checkNumber(num1, pattern);
        checkNumber(num2, pattern);
        checkNumber(num3, pattern);
    }

    private static void checkNumber(String phone, Pattern pattern) {
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            System.out.println(phone + " : Valid phone number");
        } else {
            System.out.println(phone + " : Invalid phone number");
        }
    }
}

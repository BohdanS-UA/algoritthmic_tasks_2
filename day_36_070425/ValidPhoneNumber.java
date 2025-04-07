// https://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
  public static boolean validPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
  }
}

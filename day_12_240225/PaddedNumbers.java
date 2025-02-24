// https://www.codewars.com/kata/51c89385ee245d7ddf000001/train/java

public class Kata {
  public static String solution(int value) {
        String stringValue = String.valueOf(value);
        StringBuilder builder = new StringBuilder("Value is ");
        int size = stringValue.length();
        for (int i = 0; i < 5 - size; i++) {
            builder.append("0");
        }
        builder.append(stringValue);
        return builder.toString();
  }
}

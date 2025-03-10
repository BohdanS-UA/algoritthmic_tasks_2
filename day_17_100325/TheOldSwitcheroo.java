// https://www.codewars.com/kata/55d410c492e6ed767000004f/train/java

public class Kata {
  public static String vowel2Index(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                builder.append(i + 1);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
  }
}

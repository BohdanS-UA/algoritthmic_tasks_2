// https://www.codewars.com/kata/559536379512a64472000053/train/java

public class PlayPass {
	public static String playPass(String s, int n) {
		    StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    c = (char) ('A' + (c - 'A' + n) % 26);
                } else {
                    c = (char) ('a' + (c - 'a' + n) % 26);
                }
                c = (i % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                builder.append(c);
            } else if (Character.isDigit(c)) {
                builder.append(9 - Character.getNumericValue(c));
            } else {
                builder.append(c);
            }
        }
        return builder.reverse().toString();
	}
}

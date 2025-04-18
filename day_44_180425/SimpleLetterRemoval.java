// https://www.codewars.com/kata/5b728f801db5cec7320000c7/train/java

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        if (k > s.length()) {
            return "";
        }
        StringBuilder builder = new StringBuilder(s);
        int counter = 0;
        for (int i = 0; i < 26 && counter < k; i++) {
            char c = (char) (i + 'a');
            for (int j = 0; j < builder.length() && counter < k; j++) {
                if (builder.charAt(j) == c) {
                    builder.deleteCharAt(j);
                    counter++;
                  j--;
                }
            }
        }
        return builder.toString();
    }
}

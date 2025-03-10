// https://www.codewars.com/kata/59325dc15dbb44b2440000af/train/java

public class Solution {
    public static boolean isAlt(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 1; i < word.length(); i++) {
            boolean order = true;
            if ((vowels.contains(String.valueOf(word.charAt(i))) &&
                    !vowels.contains(String.valueOf(word.charAt(i - 1)))) ||
                    (!vowels.contains(String.valueOf(word.charAt(i))) &&
                            vowels.contains(String.valueOf(word.charAt(i - 1))))
            ) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

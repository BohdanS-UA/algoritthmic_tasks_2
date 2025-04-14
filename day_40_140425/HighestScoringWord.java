// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

public class Kata {

  public static String high(String s) {
        String[] strings = s.split(" ");
        int[] scores = new int[strings.length];
        int max = 0;
        int index = 0;
        for (int i = 0; i < strings.length; i++) {
            scores[i] = getScores(strings[i]);
            if (scores[i] > max) {
                max = scores[i];
                index = i;
            }
        }
        return strings[index];
    }

    private static int getScores(String str) {
        long count = str.chars()
                .map(c -> c - 'a' + 1)
                .sum();
        return (int) count;
    }
}

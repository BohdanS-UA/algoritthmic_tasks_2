// https://www.codewars.com/kata/5c55ad8c9d76d41a62b4ede3/train/java

import java.util.Arrays;

public class Solution {
  public static int duplicates(int[] array) {
        Arrays.sort(array);
        int counter = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] == array[i - 1]) {
                counter++;
                i++;
            }
        }
        return counter;
  }
}

// https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java

import java.util.Arrays;

class SumParts {
  public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        result[0] = Arrays.stream(ls).sum();
        for (int i = 1; i < ls.length; i++) {
            result[i] = result[i - 1] - ls[i - 1];
        }
        result[ls.length] = 0;
        return result;
  }
}

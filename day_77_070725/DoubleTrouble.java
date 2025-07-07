// https://www.codewars.com/kata/57f7796697d62fc93d0001b8/train/java

import java.util.ArrayList;
import java.util.List;

public class Solution {
   public static int[] trouble(int[] x, int t) {
        List<Integer> xList = new ArrayList<>();
        xList.add(x[0]);
        for (int i = 1; i < x.length ; i++) {
            if (xList.get(xList.size() - 1) + x[i] != t) {
                xList.add(x[i]);
            }
        }
        return xList.stream()
                .mapToInt(i -> (int) i)
                .toArray();
    }
}

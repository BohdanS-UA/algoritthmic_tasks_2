// https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java

import java.util.Arrays;

public class Solution {

  public static int solveSuperMarketQueue(int[] customers, int n) {
    if (customers.length == 0 || n == 0) return 0;
        int[] checkouts = new int[n];
    for (int i = 0; i < Math.min(n, customers.length); i++) {
            checkouts[i] = customers[i];
    }

    for (int i = n; i < customers.length; i++) {
            int index = findMin(checkouts);
            checkouts[index] += customers[i];
    }
    return Arrays.stream(checkouts).max().orElseThrow();
  }

  public static int findMin(int[] customers) {
        int min = customers[0];
        int index = 0;
        for (int i = 1; i < customers.length; i++) {
            if (customers[i] < min) {
                min = customers[i];
                index = i;
            }
        }
        return index;
    }
}

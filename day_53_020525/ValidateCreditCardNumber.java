// https://www.codewars.com/kata/5418a1dd6d8216e18a0012b2/train/java

import java.util.Arrays;

public class Validate{
  public static boolean validate(String n){
        int[] array = n.chars()
                .map(c -> c - '0')
                .toArray();
        int startInd = 0;
        if (array.length % 2 != 0) {
            startInd = 1;
        }
        for (int i = startInd; i < array.length; i += 2) {
            array[i] *= 2;
            if (array[i] > 9) {
                array[i] = array[i] / 10 + array[i] - 10;
            }
        }
        int sum = Arrays.stream(array).sum();
        return (sum % 10) == 0 ? true : false;
  }
}

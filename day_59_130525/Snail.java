// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {

    public static int[] snail(int[][] array) {
        if (array.length == 0) {
            return new int[]{};
        }
        List<Integer> result = new ArrayList<>();
        int left = 0, right = array[0].length - 1;
        int top = 0, bottom = array.length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result.add(array[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(array[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(array[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(array[i][left]);
                }
                left++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
   } 
}

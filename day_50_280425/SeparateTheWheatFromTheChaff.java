// https://www.codewars.com/kata/5bdcd20478d24e664d00002c/train/java

import java.util.Arrays;

public class Kata {

	public static long[] wheatFromChaff(long[] values) {
		    long[] result = new long[values.length];
        System.arraycopy(values, 0, result, 0, values.length);
        int lastNegativeIndex = getLastNegativeIndex(result, result.length - 1);
        for (int i = 0; i < lastNegativeIndex ; i++) {
            if (result[i] > 0) {
                long temp = result[lastNegativeIndex];
                result[lastNegativeIndex] = result[i];
                result[i] = temp;
                lastNegativeIndex = getLastNegativeIndex(result, lastNegativeIndex);
            }
        }
        return result;
    }

    private static int getLastNegativeIndex(long[] values, int prevIndex) {
        for (int i = prevIndex; i >= 0 ; i--) {
            if (values[i] < 0) {
                return i;
            }
        }
        return 0;
    }
}

// https://www.codewars.com/kata/569b5cec755dd3534d00000f/train/java

import java.util.Arrays;

public class NewAverage {
    public static long newAvg(double[] arr, double navg) {
        double sum = Arrays.stream(arr).sum();
        long result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (result < 0) {
            throw new IllegalArgumentException("--- Exception 1 ---");
        }
        return result;
    }
}

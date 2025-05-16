// https://www.codewars.com/kata/51f41b98e8f176e70d0002a8/train/java

import java.util.Arrays;

public class SortArray{
  
  /*
    You'll have to replace the "Something" type by whatever you'll need
    Might be that you'll want to define other methods too...
  */
  
public static int[] sortArray(int[] input) {
        Arrays.sort(input);
        return input;
    }

    public static long[] sortArray(long[] input) {
        Arrays.sort(input);
        return input;
    }

    public static double[] sortArray(double[] input) {
        Arrays.sort(input);
        return input;
    }

    public static float[] sortArray(float[] input) {
        Arrays.sort(input);
        return input;
    }

    public static <T extends Comparable<T>> T[] sortArray(T[] input) {
        Arrays.sort(input);
        return input;
    }
}

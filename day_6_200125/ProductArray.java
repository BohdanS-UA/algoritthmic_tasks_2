// https://www.codewars.com/kata/5a905c2157c562994900009d/train/java

public class Solution {
    public static long[] productArray(int[] numbers) {
        long productAll = 1;
        for (int number : numbers) {
            productAll *= number;
        }

        long[] resultArray = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            resultArray[i] = productAll / numbers[i];
        }
        return resultArray;
    }
}

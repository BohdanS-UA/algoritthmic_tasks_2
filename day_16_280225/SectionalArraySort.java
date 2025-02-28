// https://www.codewars.com/kata/58ef87dc4db9b24c6c000092/train/java

import java.util.Arrays;

class SectionalArray {
    static int[] sort(final int[] array, final int start, final int... length) {
        int[] result = new int[array.length];
        int sortedLength;
        if (length.length == 0 || start + length[0] >= array.length) {
            sortedLength = array.length - start;
        } else {
            sortedLength = length[0];
        }
        int[] sorted = new int[sortedLength];

        System.arraycopy(array, 0, result, 0, start);
        System.arraycopy(array, start, sorted, 0, sortedLength);
        Arrays.sort(sorted);
        System.arraycopy(sorted, 0, result, start, sortedLength);
        if (result.length > start + sortedLength) {
            System.arraycopy(array, start + sortedLength, result,
                    start + sortedLength, result.length - start - sortedLength);
        }
        return result;
    }
}

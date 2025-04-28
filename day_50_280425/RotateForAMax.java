// https://www.codewars.com/kata/56a4872cbb65f3a610000026/train/java

import java.util.Arrays;

public class MaxRotate {
    public static long maxRot(long n) {
        String str = String.valueOf(n);
        StringBuilder builder = new StringBuilder(str);
        long[] rotatedArr = new long[str.length()];
        rotatedArr[0] = n;
        for (int i = 0; i < str.length() - 1; i++) {
            char iChar = builder.charAt(i);
            builder.deleteCharAt(i);
            builder.append(iChar);
            rotatedArr[i + 1] = Long.valueOf(builder.toString());
        }
        Arrays.sort(rotatedArr);
        return rotatedArr[rotatedArr.length - 1];
    }
}

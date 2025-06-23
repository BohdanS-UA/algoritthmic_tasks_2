// https://www.codewars.com/kata/560a4962c0cc5c2a16000068/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sumpowdig {
    
    public static long[] eqSumPowDig(long hmax, int exp) {
        List<Long> resultList = new ArrayList<>();
        for (int i = 2; i <= hmax; i++) {
            if (findSumOfPowers(i, exp) == i) {
                resultList.add((long) i);
            }
        }
        return resultList.stream()
                .mapToLong(Long::longValue)
                .toArray();
    }

    private static long findSumOfPowers(long number, int exp) {
        String sNum = String.valueOf(number);
        long sum = 0;
        for (int i = 0; i < sNum.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(sNum.charAt(i)));
            sum += Math.pow(digit, exp);
        }
        return sum;
    }
}

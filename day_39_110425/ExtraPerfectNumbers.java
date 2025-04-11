// https://www.codewars.com/kata/5a662a02e626c54e87000123/train/java

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution
{
    public static int[] extraPerfect(int number)
    {
        return IntStream.range(1, number + 1)
                .filter(i -> {
                            String binaryString = Integer.toBinaryString(i);
                            if (binaryString.charAt(0) == binaryString.charAt(binaryString.length() - 1)) {
                                return true;
                            }
                            return false;
                        }
                ).toArray();
    }
}

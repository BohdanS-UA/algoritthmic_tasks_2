// https://www.codewars.com/kata/5c5086287bc6600001c7589a/train/java

public class NegativeZeroValidator {
    public static boolean isNegativeZero(float n) {
        return Float.floatToIntBits(n) == Float.floatToIntBits(-0f);
    }
}

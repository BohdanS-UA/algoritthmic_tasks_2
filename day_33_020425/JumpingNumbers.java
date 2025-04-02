// https://www.codewars.com/kata/5a54e796b3bfa8932c0000ed/train/java

public class Solution
{
    public static String jumpingNumber(int number)
    {
        String stringNum = String.valueOf(number);
        if (stringNum.length() <= 1) {
            return "Jumping!!";
        }

        for (int i = 1; i < stringNum.length(); i++) {
            if (Math.abs(stringNum.charAt(i) - stringNum.charAt(i - 1)) != 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
}

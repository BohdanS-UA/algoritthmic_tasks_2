// https://www.codewars.com/kata/5a55f04be6be383a50000187/train/java

public class Solution
{
    public static String specialNumber(int number)
    {
        String s = String.valueOf(number);
        String specials = "012345";
        for (Character c : s.toCharArray()) {
            if (!specials.contains(String.valueOf(c))) {
                return "NOT!!";
            }
        }
        return "Special!!";
    }
}

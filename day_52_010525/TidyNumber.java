// https://www.codewars.com/kata/5a87449ab1710171300000fd/train/java

public class Solution
{
    public static boolean tidyNumber(int number)
    {
        String str = String.valueOf(number);
        for (int i = 1; i < str.length(); i++){
            char c = str.charAt(i);
            if (Integer.valueOf(str.charAt(i)) < Integer.valueOf(str.charAt(i - 1))) {
                return false;
            }
        }
        return true;
    }
}

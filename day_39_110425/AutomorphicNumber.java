// https://www.codewars.com/kata/5a58d889880385c2f40000aa/train/java

public class Solution
{
    public static String autoMorphic(int number) {
        String numString = String.valueOf(number);
        String squareString = String.valueOf((int) Math.pow( number, 2));
        for (int i = 0; i < numString.length(); i++) {
            int indexSquare = squareString.length() - numString.length() + i;
            if (numString.charAt(i) != squareString.charAt(indexSquare)) {
                return "Not!!";
            }
        }
        return "Automorphic";
    }
}

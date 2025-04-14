// https://www.codewars.com/kata/5bdc191306a8a678f6000187/train/java

public class Solution {
  public static int shiftLeft(String a, String b) {
        int counter = 0;
        StringBuilder builderA = new StringBuilder(a);
        StringBuilder builderB = new StringBuilder(b);

        while (!builderA.toString().contentEquals(builderB)) {
            if (builderA.length() >= builderB.length()) {
                builderA.deleteCharAt(0);
                counter++;
            } else if (builderA.length() < builderB.length()) {
                builderB.deleteCharAt(0);
                counter++;
            }
        }
        return counter;
  }
}

// https://www.codewars.com/kata/628e3ee2e1daf90030239e8a/train/java

public class Kata {
  public static boolean interlockable(long a, long b) {
        String aBinary = Long.toBinaryString(a);
        String bBinary = Long.toBinaryString(b);
        int min = Math.min(aBinary.length(), bBinary.length());
        for (int i = 0; i < min; i++) {
            if (aBinary.charAt(aBinary.length() - 1 - i) == '1' && bBinary.charAt(bBinary.length() - 1 - i) == '1') {
                return false;
            }
        }
        return true;
  }
}

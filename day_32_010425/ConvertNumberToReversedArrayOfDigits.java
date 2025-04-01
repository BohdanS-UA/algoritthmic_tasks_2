// https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java

public class Kata {
  public static int[] digitize(long n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        return arr;
  }
}

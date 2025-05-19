// https://www.codewars.com/kata/5596f6e9529e9ab6fb000014/train/java

public class CalculateRotation {
  static int shiftedDiff(String first, String second){
        if (first.length() != second.length()) return -1;

        String concatedString = first + first;
        int index = concatedString.indexOf(second);

        return index <= 0 ? index : first.length() - index;
  }
}

// https://www.codewars.com/kata/58daa7617332e59593000006/train/java

public class MostDigits {
  public static int findLongest(int[] numbers) {
        int maxNumber = 0;
        int longestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            int length = String.valueOf(Math.abs(numbers[i])).length();
            if (length > maxNumber) {
                maxNumber = length;
                longestNumber = numbers[i];
            }
        }
        return longestNumber;
  }
}

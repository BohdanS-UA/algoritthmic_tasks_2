// https://www.codewars.com/kata/57f7b8271e3d9283300000b4/train/java

public class Kata{
  public static String evenOrOdd(String str){
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit % 2 == 0){
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        if (evenSum == oddSum) {
            return "Even and Odd are the same";
        }
        return evenSum > oddSum ? "Even is greater than Odd" : "Odd is greater than Even";
  }
}

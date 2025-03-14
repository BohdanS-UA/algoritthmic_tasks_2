// https://www.codewars.com/kata/5738f5ea9545204cec000155/train/java

public class Kata{
  public static int countLettersAndDigits(String input){
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) || Character.isDigit(input.charAt(i))) {
                counter++;
            }
        }
        return counter;
  }
}

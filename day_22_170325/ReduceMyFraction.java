// https://www.codewars.com/kata/576400f2f716ca816d001614/train/java

public class Reduce{
  public static int[] myFraction(int[] fractions){
        int commonDenominator = 2;
        int min = Math.min(fractions[0], fractions[1]);
        do {
            commonDenominator = 2;
            min = Math.min(fractions[0], fractions[1]);
            while (commonDenominator <= min) {
                if (fractions[0] % commonDenominator == 0 && fractions[1] % commonDenominator == 0) {
                    fractions[0] = fractions[0] / commonDenominator;
                    fractions[1] = fractions[1] / commonDenominator;
                    break;
                } else {
                    commonDenominator++;
                }
            }
        } while (commonDenominator <= min);
        return fractions;
  }
}

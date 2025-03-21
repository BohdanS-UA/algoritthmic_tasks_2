// https://www.codewars.com/kata/595519279be6c575b5000016/train/java

public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
        int xSum = findTheSum(x);
        int ySum = findTheSum(y);

        if (xSum == ySum) {
            return "Tie!";
        }

        return xSum > ySum ? x : y;
    }

    public static int findTheSum(String a) {
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += a.charAt(i) - 64;
        }
        return sum;
    }
}

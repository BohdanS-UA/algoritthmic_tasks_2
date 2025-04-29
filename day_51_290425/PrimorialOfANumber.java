// https://www.codewars.com/kata/5a99a03e4a6b34bb3c000124/train/java

import java.math.BigInteger;

public class Primorial {
    public static String numPrimorial(int n) {
        int counter = 0;
        int i = 1;
        BigInteger primorial = BigInteger.ONE;
        while (counter < n) {
            i++;
            if (isPrime(i)) {
                primorial = primorial.multiply(BigInteger.valueOf(i));
                counter++;
            }
        }
        return String.valueOf(primorial);
    }

    private static boolean isPrime(int n ) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i < Math.sqrt(n) + 1 ; i = i + 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

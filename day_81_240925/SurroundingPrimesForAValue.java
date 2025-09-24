// https://www.codewars.com/kata/560b8d7106ede725dd0000e2/train/java

class BeforeAfterPrimes {
    public static long[] primeBefAft(long num) {
        long high = num;
        long low = num;
        while (!isPrime(++high)) {
        }
        while (!isPrime(--low)) {
        }
        return new long[]{low, high};
    }

    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

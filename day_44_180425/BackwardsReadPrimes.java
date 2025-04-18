// https://www.codewars.com/kata/5539fecef69c483c5a000015/train/java

public class BackWardsPrime {
	
	public static String backwardsPrime(long start, long end) {
        StringBuilder builder = new StringBuilder();
        for (long i = start; i <= end; i++) {
            if (isPrime(i) && !isPalindrome(i) && isPrime(getBackwardNum(i))) {
                builder.append(i).append(" ");
            }
        }
        return builder.toString().trim();
    }

    private static boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;

        for (long i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }

    private static boolean isPalindrome(long num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length() / 2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static long getBackwardNum(long num) {
        StringBuilder builder = new StringBuilder(String.valueOf(num));
        builder.reverse();
        return Long.valueOf(builder.toString());
    }
}

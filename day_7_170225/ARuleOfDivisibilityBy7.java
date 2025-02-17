// https://www.codewars.com/kata/55e6f5e58f7817808e00002e/train/java

class DivSeven {
    public static long[] seven(long m) {
       String stringM = String.valueOf(m);
        int steps = 0;
        while (stringM.length() > 2) {
            long decimal = m / 10;
            long leftover = m % 10;
            m = decimal - 2 * leftover;
            stringM = String.valueOf(m);
            steps++;
        }
        return new long[]{m, steps};
    }
}

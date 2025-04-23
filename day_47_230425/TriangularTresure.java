// https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java

public class Triangular {
    public static long triangular(long n) {
      if (n <= 0) return 0;

        long counter = 0;
        for (int i = 0; i < n; i++) {
            counter += i + 1;
        }
        return counter;
    }
}

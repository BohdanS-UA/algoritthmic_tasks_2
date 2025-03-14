// https://www.codewars.com/kata/544975fc18f47481ba00107b/train/java

public class CircleSorted {

    public boolean isCircleSorted(int[] a) {
        boolean foundAPeak = false;
        if (a[a.length - 1] > a[0]) {
            foundAPeak = true;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                if (foundAPeak) {
                    return false;
                } else {
                    foundAPeak = true;
                }
            }
        }
        return true;
    }
}

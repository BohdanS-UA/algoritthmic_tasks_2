// https://www.codewars.com/kata/589d36bbb6c071f7c20000f7/train/java

public class Kata {
    public static boolean primeString(String s) {
        int n = s.length();
        if (n == 1) return true;

        boolean allSame = true;
        char firstChar = s.charAt(0);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != firstChar) {
                allSame = false;
                break;
            }
        }
        if (allSame) return false;

        for (int substringLength = 1; substringLength <= n / 2; substringLength++) {
            if (n % substringLength != 0) continue;
            String substring = s.substring(0, substringLength);
            boolean isComposite = true;
            for (int i = 1; i < n / substringLength; i++) {
                if (!s.substring(i * substringLength, (i + 1) * substringLength).equals(substring)) {
                    isComposite = false;
                    break;
                }
            }
            if (isComposite) return false;
        }
        return true;
    }
}

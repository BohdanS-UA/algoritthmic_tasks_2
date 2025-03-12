// https://www.codewars.com/kata/55ffb44050558fdb200000a4/train/java

public class SumDigNth {
    
    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
        int counter = 1;
        long countersElement = initval;
        boolean found = false;
        while (!found) {
            for (int i = 0; i < patternl.length; i++) {
                countersElement += patternl[i];
                counter++;
                if (counter == nthterm) {
                    found = true;
                    break;
                }
            }
        }
        String s = String.valueOf(countersElement);
        long result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += Integer.valueOf(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}

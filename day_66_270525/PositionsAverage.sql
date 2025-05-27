// https://www.codewars.com/kata/59f4a0acbee84576800000af/train/java

public class PositionAverage {
    public static double posAverage(String s) {
        String[] strings = s.split(",");
        int counter = 0;
        int totalComparisons = 0;
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length ; j++) {
                counter += compareStrings(strings[i].trim(), strings[j].trim());
                totalComparisons += strings[i].trim().length();
            }
        }
        return (((double) counter) / totalComparisons) * 100;
    }

    private static int compareStrings(String x, String y) {
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);
        int counter = 0;
        for (int i = 0; i < strX.length(); i++) {
            if (strX.charAt(i) == strY.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}

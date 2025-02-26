// https://www.codewars.com/kata/55b3425df71c1201a800009c/train/java

import java.util.Arrays;

public class Stat {
        
	public static String stat(String strg) {
		    String[] strings = strg.split(", ");
        int[] results = new int[strings.length];
        int max = 0;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < strings.length; i++) {
            results[i] = convertTimeFromStringToInt(strings[i]); //in format seconds int
            if (results[i] > max) {
                max = results[i];
            }
            if (results[i] < min) {
                min = results[i];
            }
            sum += results[i];
        }
        int range = max - min;
        double average = sum / results.length;
        Arrays.sort(results);
        int median = 0;
        if (results.length % 2 == 0) {
            median = (results[results.length / 2] + results[results.length / 2 - 1]) / 2;
        } else {
            median = results[(results.length - 1) / 2];
        }
        return "Range: " + convertTimeFromIntToString(range)
                + " Average: " + convertTimeFromIntToString((int) average)
                + " Median: " + convertTimeFromIntToString(median);
    }

    private static int convertTimeFromStringToInt(String stringTime) { //input should be in h|m|s format
        String[] stringsHmS = stringTime.split("\\|");
        return Integer.parseInt(stringsHmS[0]) * 3600 + Integer.parseInt(stringsHmS[1]) * 60 + Integer.parseInt(stringsHmS[2]);
    }

    private static String convertTimeFromIntToString(int timeInSec) {
        int sec = timeInSec % 60;
        int min = (timeInSec % 3600) / 60;
        int hour = timeInSec / 3600;
        return String.format("%02d|%02d|%02d", hour, min, sec);
    }
}
	

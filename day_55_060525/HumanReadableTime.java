// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        seconds = seconds - hours * 3600 - minutes * 60;

        return String.format("%02d", hours) + ":"
                + String.format("%02d", minutes) + ":"
                + String.format("%02d", seconds);
  }
}

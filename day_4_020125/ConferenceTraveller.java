// https://www.codewars.com/kata/56f5594a575d7d3c0e000ea0/train/java

public class Kata {
  static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        for (int i = 0; i < citiesOffered.length; i++) {
            boolean wasVisited = false;
            for (String city : citiesVisited) {
                if (citiesOffered[i].equals(city)) {
                    wasVisited = true;
                    break;
                }
            }
            if (!wasVisited) {
                return citiesOffered[i];
            }
        }
        return "No worthwhile conferences this year!";
  }
}

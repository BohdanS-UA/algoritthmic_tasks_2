// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    Map<Character, Integer> map = new HashMap<>();
        String lowerCase = text.toLowerCase();
        for (Character c : lowerCase.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int counter = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                counter++;
            }
        }
        return counter;
  }
}

// https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
  public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : a) {
            if (map.containsKey(num)) {
                Integer i = map.get(num) + 1;
                map.put(num, i);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

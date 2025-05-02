// https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

import java.util.HashMap;
import java.util.Map;

// Make sure your class is public
 public class Kata {
    public static double findUniq(double arr[]) {
        HashMap<Double, Integer> hashMap = new HashMap<>();
        Double result = null;
        for (int i = 0; i < arr.length; i++) {
            double number = arr[i];
            if (hashMap.containsKey(number)) {
                hashMap.put(number, hashMap.get(number) + 1);
            } else {
                hashMap.put(number, 1);
            }

            if (i > 1) {
                for (Map.Entry<Double, Integer> entry : hashMap.entrySet()) {
                    if (entry.getValue().equals(1)) {
                        result = entry.getKey();
                    } else if (entry.getValue() > 1 && result != null) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}

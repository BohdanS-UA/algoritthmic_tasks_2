// https://www.codewars.com/kata/5a86073fb17101e453000258/train/java

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String[] sortEmotions(boolean order, String[] emotions) {
        if (emotions == null || emotions.length == 0) {
			return emotions;
        }
        
        Map<String, Integer> emotionMap = new HashMap<String, Integer>();
        emotionMap.put(":D", 1);
        emotionMap.put(":)", 2);
        emotionMap.put(":|", 3);
        emotionMap.put(":(", 4);
        emotionMap.put("T_T", 5);

        if (order) {
            return Arrays.stream(emotions)
                    .sorted(Comparator.comparing(emotion -> emotionMap.get(emotion)))
                    .toArray(String[]::new);
        } else {
            return Arrays.stream(emotions)
                    .sorted(Comparator.comparing(emotion -> emotionMap.get(emotion)).reversed())
                    .toArray(String[]::new);
        }
    }
}

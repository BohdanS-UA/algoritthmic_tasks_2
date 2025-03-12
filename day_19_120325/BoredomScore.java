// https://www.codewars.com/kata/57ed4cef7b45ef8774000014/train/java

import java.util.HashMap;
import java.util.Map;

public class TheOffice {
  public static String boredom(Person[] staff) {
    Map<String, Integer> deparmentScoreMap = new HashMap<>();
        deparmentScoreMap.put("accounts", 1);
        deparmentScoreMap.put("finance", 2);
        deparmentScoreMap.put("canteen", 10);
        deparmentScoreMap.put("regulation", 3);
        deparmentScoreMap.put("trading", 6);
        deparmentScoreMap.put("change", 6);
        deparmentScoreMap.put("IS", 8);
        deparmentScoreMap.put("retail", 5);
        deparmentScoreMap.put("cleaning", 4);
        deparmentScoreMap.put("pissing about", 25);

        int sum = 0;
        for (Person p : staff) {
            sum += deparmentScoreMap.get(p.department);
        }

        if (sum <= 80) {
            return "kill me now";
        }

        if (sum > 80 && sum < 100) {
            return "i can handle this";
        }
        return "party time!!";
  }
}

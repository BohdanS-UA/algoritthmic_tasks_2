// https://www.codewars.com/kata/59f44c7bd4b36946fd000052/train/java

import java.util.LinkedHashMap;
import java.util.Map;

class Hist {
  public static String hist(String s) {
      Map<Character, Integer> errorsMap = new LinkedHashMap<>();
        errorsMap.put('u', 0);
        errorsMap.put('w', 0);
        errorsMap.put('x', 0);
        errorsMap.put('z', 0);
        
      for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (errorsMap.containsKey(c)) {
                errorsMap.replace(c, errorsMap.get(c) + 1);
            }
        }

      StringBuilder builder = new StringBuilder();
      
      for (var entry : errorsMap.entrySet()) {
        if (entry.getValue() > 0) {
           builder.append(entry.getKey()).append("  ")
                   .append(entry.getValue()) 
                   .append(entry.getValue() < 10 ? "     " : "    ") 
                   .append("*".repeat(entry.getValue())) 
                   .append("\r");
        }
      }
      return builder.toString().trim(); 
    }
}

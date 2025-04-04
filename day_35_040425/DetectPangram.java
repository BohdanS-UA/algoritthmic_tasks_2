// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java

import java.util.HashMap;

public class PangramChecker {
  public boolean check(String sentence){
        String cleanString = sentence.toLowerCase().replaceAll("[^a-zA-Z]", "");
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : cleanString.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map.size() == 26 ? true : false;
  }
}

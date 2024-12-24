// https://www.codewars.com/kata/5dd5128f16eced000e4c42ba/train/java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Solution{
    public static char solve(String s){
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> charValue = new HashMap<>();
        int maxValue = 0;
        for (int i = 0; i < charArray.length; i++) {
            int firstIndex = 0;
            int lastIndex = 0;
            if (!charValue.containsKey(charArray[i])) {
                firstIndex = i;
                for (int j = charArray.length - 1; j >= 0; j--) {
                    if (charArray[j] == charArray[i]) {
                        lastIndex = j;
                        charValue.put(charArray[i], lastIndex - firstIndex);
                        if ((lastIndex - firstIndex) > maxValue) {
                            maxValue = lastIndex - firstIndex;
                        }
                        break;
                    }
                }
            }
        }

        List<Character> characterList = new ArrayList<>();
        for (Entry<Character, Integer> entry : charValue.entrySet()){
            if (entry.getValue() == maxValue) {
                characterList.add(entry.getKey());
            }
        }
        if (characterList.size() == 1) {
            return characterList.get(0);
        } else {
            char lowestChar = 'z';
            for (int i = 0; i < characterList.size(); i++) {
                if (characterList.get(i) < lowestChar) {
                    lowestChar = characterList.get(i);
                }
            }
            return lowestChar;
        }
    }
}

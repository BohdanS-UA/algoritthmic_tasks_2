// https://leetcode.com/problems/word-pattern/submissions/1570010920/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c) && !map.containsValue(words[i])) {
                map.put(c, words[i]);
            } else {
                if ((map.get(c) != null && !map.get(c).equals(words[i])) ||
                        (!map.containsKey(c) && map.containsValue(words[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}

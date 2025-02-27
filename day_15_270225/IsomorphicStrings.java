// https://leetcode.com/problems/isomorphic-strings/submissions/1556934182/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                if (!map.containsValue(t.charAt(i))) {
                    map.put(c, t.charAt(i));
                } else {
                    return false;
                }
            }
            if (map.containsKey(c) && map.get(c) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

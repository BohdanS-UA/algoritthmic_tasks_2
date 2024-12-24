// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
       if (s.length() == 0) {
            return 0;
        }
        int maxLenngth = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            List<Character> charList = new ArrayList<>();
            for (int j = i; j < chars.length; j++) {
                if (!charList.contains(chars[j])) {
                    charList.add(chars[j]);
                } else {
                    break;
                }
            }
            if (charList.size() > maxLenngth) {
                maxLenngth = charList.size();
            }
        }
        return maxLenngth;
    }
}

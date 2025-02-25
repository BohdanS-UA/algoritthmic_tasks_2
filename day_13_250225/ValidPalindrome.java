// https://leetcode.com/problems/valid-palindrome/submissions/1554702427/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isPalindrome(String s) {
        String clearString = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        for (int i = 0; i < clearString.length() / 2; i++) {
            if (clearString.charAt(i) != clearString.charAt(clearString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

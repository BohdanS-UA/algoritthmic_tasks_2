// https://leetcode.com/problems/ransom-note/submissions/1556923790/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magazineList = new ArrayList<>();
        List<Character> ransomNoteList = new ArrayList<>();
        for (char c : magazine.toCharArray()) {
            magazineList.add(c);
        }
        for (char c : ransomNote.toCharArray()) {
            ransomNoteList.add(c);
        }
        for (int i = 0; i < ransomNoteList.size(); i++) {
            char c = ransomNoteList.get(i);
            if (magazineList.contains(c)) {
                magazineList.remove(Character.valueOf(c));
            } else {
                return false;
            }
        }
        return true;
    }
}

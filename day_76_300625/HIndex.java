// https://leetcode.com/problems/h-index/submissions/1681127129/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;
        for (int i = 0; i < citations.length ; i++) {
            if (citations[i] >= (n - i)) {
                return (n - i);
            }
        }
        return 0;
    }
}

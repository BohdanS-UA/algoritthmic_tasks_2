// https://leetcode.com/problems/jump-game-ii/submissions/1662655517/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int jump(int[] nums) {
         int left = 0;
        int right = 0;
        int jumps = 0;
        while (right < nums.length - 1) {
            int max = 0;
            for (int i = left; i <= right ; i++) {
                max = Math.max(max, i + nums[i]);
            }
            left = right++;
            right = max;
            jumps++;
        }
        return jumps;
    }
}

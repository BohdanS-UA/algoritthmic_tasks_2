// https://leetcode.com/problems/jump-game/submissions/1586611587/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canJump(int[] nums) {
        int right = nums.length - 1;
        int left = nums.length - 2;
        while (left >= 0) {
            if (nums[left] + left >= right) {
                right = left;
                left--;
            } else {
                left--;
            }
        }
        return right == 0 ? true : false;
    }
}

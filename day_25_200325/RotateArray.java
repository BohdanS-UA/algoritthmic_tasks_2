// https://leetcode.com/problems/rotate-array/submissions/1579971071/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int index = (length - k + i) % length;
            result[i] = nums[index];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = result[i];
        }
    }
}

// https://leetcode.com/problems/majority-element/submissions/1554693659/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
                if (counter > nums.length / 2) {
                    return nums[i];
                }
            } else {
                counter = 1;
            }
        }
        return 0;
    }
}

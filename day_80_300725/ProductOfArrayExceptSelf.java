// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int left = 1;
        for (int i = 1; i < nums.length; i++) {
            left *= nums[i - 1];
            result[i] *= left;
        }

        int right = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right *= nums[i + 1];
            result[i] *= right;
        }
        return result;
    }
}

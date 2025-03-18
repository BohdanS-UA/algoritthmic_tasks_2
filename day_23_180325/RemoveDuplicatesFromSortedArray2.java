// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/1577699971/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int k = 2;
        for(int i = 2; i < nums.length; i++){
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

// https://leetcode.com/problems/summary-ranges/submissions/1572243744/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>(); 
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(nums[0]);
        boolean moreThanOne = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                moreThanOne = true;
                if (i == nums.length - 1) {
                    builder.append("->").append(nums[i]);
                }
            } else {
                if (moreThanOne) {
                    builder.append("->").append(nums[i - 1]);
                }
                result.add(builder.toString());
                builder = new StringBuilder();
                moreThanOne = false;
                builder.append(nums[i]);
            }
        }
        result.add(builder.toString());
        return result;
    }
}

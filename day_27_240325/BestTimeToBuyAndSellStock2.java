// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int today = prices[i];
            int yesterday = prices[i - 1];
            if (today > yesterday) {
                profit += today - yesterday;
            }
        }
        return profit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, max = 0;

        while (l < prices.length && r < prices.length) {
            if (prices[r] - prices[l] < 0) {
                l = r;
            } else {
                max = Math.max(prices[r] - prices[l], max);
            }
            r++;
        }
        return max;
    }
}
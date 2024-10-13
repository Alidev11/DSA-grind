class Solution {
    public int maxProfit(int[] prices) {
        int i=0, j=1, maxProfit=0;
        while(j<prices.length){
            if(prices[j]-prices[i]<0){
                i=j;
            }
            maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
            j++;
        }
        return maxProfit;
    }
}
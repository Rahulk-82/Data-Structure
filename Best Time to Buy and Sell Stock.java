class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minValue=prices[0];
        int profit=0;
        for(int i : prices){
            minValue=Math.min(minValue,i);
            profit=i-minValue;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
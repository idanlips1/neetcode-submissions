class Solution {
    public int maxProfit(int[] prices) {
        int totalSum = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]){
                totalSum += prices[i] - prices[i-1];
            }

        }
        return totalSum;
    }
}
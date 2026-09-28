class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = prices[0];
        int maxSum = 0;
        for(int i =0;i< prices.length;i++){
          if(prices[i] < minValue) minValue = prices[i];
          int profit = prices[i] - minValue;
          maxSum = Math.max(maxSum , profit); 
        }
        return maxSum;
    }
}

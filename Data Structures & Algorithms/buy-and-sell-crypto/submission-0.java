class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int minprice = arr[0];
        int maxprofit = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < minprice) minprice = arr[i];
            int profit = arr[i] - minprice;
            if(profit > maxprofit) maxprofit = profit;
        }
        return maxprofit;
    }
}

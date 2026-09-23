class Solution {
    public int maxProfit(int[] arr) {
      int n = arr.length;
      int minValue= arr[0];
      int maxProf = 0;
      for(int i = 0;i<n;i++){
        if(arr[i] < minValue) minValue = arr[i];
        int profit = arr[i] - minValue;

        if(profit > maxProf) maxProf = profit;
      }  
      return maxProf;
    }
}

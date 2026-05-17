class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return loot(0,nums,dp);
    }
    int loot(int i, int [] nums, int[] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + loot(i+2, nums,dp);
        int skip = loot(i+1 ,nums,dp);

        dp[i] = Math.max(pick,skip);
        return dp[i];
    }
    
}

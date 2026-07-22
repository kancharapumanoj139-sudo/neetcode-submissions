class Solution {
    public int find(int[] nums,int n,int dp[])
    {
        if(n==0) return nums[0];
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        int take=nums[n]+find(nums,n-2,dp);
        int skip=find(nums,n-1,dp);
        return dp[n]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length-1;
        int dp[]=new int[n+1];
        return find(nums,n,dp);
    }
}

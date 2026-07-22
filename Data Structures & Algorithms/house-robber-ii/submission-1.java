class Solution {
    public int find(int[] nums,int st,int end,int[] dp)
    {
        if(st>end) return 0;
        if(dp[st]!=0) return dp[st];
        int take=nums[st]+find(nums,st+2,end,dp);
        int not=find(nums,st+1,end,dp);
        return dp[st]=Math.max(take,not);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[]=new int[n+1];
        int dp1[]=new int[n+1];
        int c1=find(nums,0,n-2,dp);
        int c2=find(nums,1,n-1,dp1);
        return Math.max(c1,c2);
    }
}

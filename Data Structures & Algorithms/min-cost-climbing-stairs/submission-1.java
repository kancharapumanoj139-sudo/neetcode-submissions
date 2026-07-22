class Solution {
    public int find(int n,int[] cost,int[] dp)
    {
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        if(dp[n]!=0) return dp[n];
        int s1=find(n-1,cost,dp);
        int s2=find(n-2,cost,dp);
        return dp[n]=cost[n]+Math.min(s1,s2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        return Math.min(find(n-1,cost,dp),find(n-2,cost,dp));
    }
}

class Solution {
    public int find(int n,int[] dp)
    {
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int s1=find(n-1,dp);
        int s2=find(n-2,dp);
        return dp[n]=s1+s2;
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return find(n,dp);
    }
}

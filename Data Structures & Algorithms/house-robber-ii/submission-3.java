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
        if (n == 2)
    return Math.max(nums[0], nums[1]);
           int dp1[] = new int[n];

        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n - 1; i++) {
            dp1[i] = Math.max(nums[i] + dp1[i - 2], dp1[i - 1]);
        }

        int ans1 = dp1[n - 2];

        int dp2[] = new int[n];

        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1], nums[2]);

        for (int i = 3; i < n; i++) {
            dp2[i] = Math.max(nums[i] + dp2[i - 2], dp2[i - 1]);
        }

        int ans2 = dp2[n - 1];

        return Math.max(ans1, ans2);
    }
}

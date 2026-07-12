class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0,min=Integer.MAX_VALUE,len;
        int l=0,r=0;
        while(r<n)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                len=r-l+1;
                min=Math.min(len,min);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return min==2147483647?0:min;
    }
}
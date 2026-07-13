class Solution {
    public int find(int[] piles,int time)
    {
        int ans=0;
        for(int i=0;i<piles.length;i++)
        {
            ans+=(piles[i] + time - 1) / time;
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0,ans=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        }
        int low=1,high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int res=find(piles,mid);
            if(res<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}

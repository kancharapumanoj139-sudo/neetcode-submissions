class Solution {
    public int find(int[] weights,int days,int mid)
    {
        int day=0,loads=0;
        for(int i=0;i<weights.length;i++)
        {
            if(loads+weights[i]>mid)
            {
                day=day+1;
                loads=weights[i];
            }
            else
            {
                loads+=weights[i];
            }
        }
        return day+1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=0,sum=0,ans=0;
        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]>max)
            {
                max=weights[i];
            }
            sum+=weights[i];
        }
        int low=max,high=sum;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int res=find(weights,days,mid);
            if(res<=days)
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
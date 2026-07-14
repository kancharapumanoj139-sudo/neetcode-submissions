class Solution {
    public void find(int[] nums,boolean[] vis, List<Integer> temp,List<List<Integer>> res)
    {
        if(temp.size()==nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(vis[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !vis[i-1]) continue;
            vis[i]=true;
            temp.add(nums[i]);
            find(nums,vis,temp,res);
            temp.remove(temp.size()-1);
            vis[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        boolean vis[]=new boolean[nums.length];
        find(nums,vis,temp,res);
        return res;
    }
}
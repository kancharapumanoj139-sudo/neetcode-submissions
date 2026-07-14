class Solution {
    public void find(int ind,int[] nums,List<Integer> temp,List<List<Integer>> res)
    {
        if(ind==nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        find(ind+1,nums,temp,res);
        temp.remove(temp.size()-1);
        find(ind+1,nums,temp,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        find(0,nums,temp,res);
        return res;
    }
}

class Solution {
    public void find(int i,int[] nums, List<Integer> temp,List<List<Integer>> res)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        find(i+1,nums,temp,res);
        temp.remove(temp.size()-1);
        int j=i+1;
        while(j<nums.length && nums[j]==nums[j-1])
        {
            j++;
        }
        find(j,nums,temp,res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        find(0,nums,temp,res);
        return res;
    }
}

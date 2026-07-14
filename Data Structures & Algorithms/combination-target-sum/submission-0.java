class Solution {
    public void find(int i,int sum,int[] nums,int target, List<Integer> temp,List<List<Integer>> res)
    {
        if(target==sum)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i==nums.length || sum>target) return;
        temp.add(nums[i]);
        find(i,sum+nums[i],nums,target,temp,res);
        temp.remove(temp.size()-1);
        find(i+1,sum,nums,target,temp,res);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        find(0,0,nums,target,temp,res);
        return res;
    }
}

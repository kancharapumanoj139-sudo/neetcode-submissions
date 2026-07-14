class Solution {
    public void find(int i,int[] nums,int target,List<Integer> li,List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(li));
            return;
        }
        if(i==nums.length || target<0) return;
        li.add(nums[i]);
        find(i+1,nums,target-nums[i],li,res);
        int j=i+1;
        li.remove(li.size()-1);
        while(j<nums.length && nums[j]==nums[j-1])
        {
            j++;
        }
        find(j,nums,target,li,res);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        find(0,candidates,target,li,res);
        return res;
    }
}

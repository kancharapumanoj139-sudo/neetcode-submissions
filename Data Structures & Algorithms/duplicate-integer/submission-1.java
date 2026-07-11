class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1)
            {
                return true;
            }
        }
        return false;
    }
}
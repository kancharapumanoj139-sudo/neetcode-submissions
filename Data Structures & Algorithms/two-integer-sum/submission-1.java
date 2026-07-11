class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int find=target-nums[i];
            if(map.containsKey(find))
            {
                arr[0]=map.get(find);
                arr[1]=i;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}

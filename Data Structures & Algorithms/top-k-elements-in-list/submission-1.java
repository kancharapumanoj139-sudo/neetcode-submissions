class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> li=new ArrayList<>(map.keySet());
        Collections.sort(li,(a,b)->map.get(b)-map.get(a));
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=li.get(i);
        }
        return res;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        int[] res=new int[k];
        for(int n=0;n<k;n++)
        {
            res[n]=list.get(n);
        }
        return res;
    }
}

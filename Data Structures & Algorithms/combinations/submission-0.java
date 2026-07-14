class Solution {
    public void find(int i,int n,int k,List<Integer> temp,List<List<Integer>> res,int level)
    {
        if(level==k)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i>n) return;
        
        temp.add(i);
        find(i+1,n,k,temp,res,level+1);
        temp.remove(temp.size()-1);
        find(i+1,n,k,temp,res,level);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        find(1,n,k,temp,res,0);
        return res;
    }
}
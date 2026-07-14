class Solution {
    public void find(int open,int close,String s,List<String> res,int n)
    {
        if(s.length()==2*n)
        {
            res.add(s);
            return;
        }
        if(open<n)
        {
            find(open+1,close,s+"(",res,n);
        }
        if(close<open)
        {
            find(open,close+1,s+")",res,n);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        find(0,0,"",res,n);
        return res;
    }
}

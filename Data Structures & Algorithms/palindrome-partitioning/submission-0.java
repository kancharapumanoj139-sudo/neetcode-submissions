class Solution {
    public boolean palindrome(String s,int st,int e)
    {
        while(st<e)
        {
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
    public void find(int i,String s,List<String> temp,List<List<String>> res)
    {
        if(i==s.length())
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            if(palindrome(s,i,j))
            {
                temp.add(s.substring(i,j+1));
            find(j+1,s,temp,res);
            temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> temp=new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        find(0,s,temp,res);
        return res;
    }
}

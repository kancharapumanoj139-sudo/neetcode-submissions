class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        Arrays.sort(strs);
        int n=strs.length;
        for(int i=0;i<strs[0].length();i++)
        {
            char a=strs[0].charAt(i);
            char b=strs[n-1].charAt(i);
            if(a==b)
            {
                ans=ans+a;
            }else{
                break;
            }
        }
        return ans;
    }
}
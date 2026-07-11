class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']+=1;
            a[t.charAt(i)-'a']-=1;
        }
        for(int c:a)
        {
            if(c!=0)
            {
                return false;
            }
        }
        return true;
    }
}

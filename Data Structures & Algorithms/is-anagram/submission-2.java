class Solution {
    public boolean isAnagram(String s, String t) {
        int[] st=new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=t.charAt(i);
            st[a-'a']++;
            st[b-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(st[i]!=0) return false;
        }
        return true;
    }
}

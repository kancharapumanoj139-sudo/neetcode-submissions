class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while(i<=j)
        {
            char a=s.charAt(i);
            char b=s.charAt(j);
            if((a<'a' || a>'z') && (a<'0' || a>'9'))
            {
                i++;
                continue;
            }
            if((b<'a' || b>'z') && (b<'0' || b>'9'))
            {
                j--;
                continue;
            }
            if(a!=b) return false;
            i++;
            j--;
        }
        return true;
    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length())
        {
            ans=ans+word1.charAt(i);
            ans=ans+word2.charAt(j);
            i++;
            j++;
        }
        if(i<word1.length())
        {
          ans=ans.concat(word1.substring(i,word1.length()));
        }
         if(j<word2.length())
        {
            ans=ans.concat(word2.substring(i,word2.length()));
        }
        return ans;
    }
}
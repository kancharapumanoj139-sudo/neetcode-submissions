class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0,r=0,max=0;
        while(r<s.length())
        {
            char ch=s.charAt(r);
            if(set.contains(ch))
            {
                while(set.contains(ch))
                {
                    set.remove(s.charAt(l));
                    l++;
                }
             }
              max=Math.max(max,r-l+1);
             set.add(ch);
             r++;
            }
              return max;
        }
    }


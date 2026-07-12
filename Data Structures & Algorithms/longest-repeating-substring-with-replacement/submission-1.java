class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,r=0,max=0,ans=0;
        for(r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));
            while ((r - l + 1) - max > k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}

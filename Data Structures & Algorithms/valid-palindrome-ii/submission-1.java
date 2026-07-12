class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                
                return isPurePalindrome(s, i + 1, j) || isPurePalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    
    
    private boolean isPurePalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        int ind=0;
        for(int i=0;i<2*n;i++)
        {
            if(i>n-1)
            {
                arr[ind]=nums[i%n];
                ind++;
            }else{
            arr[ind]=nums[i];
            ind++;
            }
        }
        return arr;
    }
}
class Solution {

    public int find(int i, int xor, int[] nums) {

        if (i == nums.length) {
            return xor;
        }
        int take = find(i + 1, xor ^ nums[i], nums);

        int notTake = find(i + 1, xor, nums);

        return take + notTake;
    }

    public int subsetXORSum(int[] nums) {
        return find(0, 0, nums);
    }
}
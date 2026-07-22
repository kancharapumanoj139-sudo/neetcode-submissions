class Solution {

    int ans = Integer.MIN_VALUE;

    public void find(int[] nums, int index, int product) {

        if (index == nums.length)
            return;

        product *= nums[index];

        ans = Math.max(ans, product);

        find(nums, index + 1, product);
    }

    public int maxProduct(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            find(nums, i, 1);
        }

        return ans;
    }
}
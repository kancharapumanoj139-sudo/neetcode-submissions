class Solution {

    public int find(int n, int[] coins, int amount) {

        if (amount == 0)
            return 0;

        if (amount < 0 || n < 0)
            return Integer.MAX_VALUE;

        int take = find(n, coins, amount - coins[n]);

        if (take != Integer.MAX_VALUE)
            take = 1 + take;

        int not = find(n - 1, coins, amount);

        return Math.min(take, not);
    }

    public int coinChange(int[] coins, int amount) {

        int ans = find(coins.length - 1, coins, amount);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
class Solution {

    int count = 0;

    public void dfs(TreeNode root, int maxSoFar) {

        if (root == null)
            return;

        if (root.val >= maxSoFar) {
            count++;
            maxSoFar = root.val;
        }

        dfs(root.left, maxSoFar);
        dfs(root.right, maxSoFar);
    }

    public int goodNodes(TreeNode root) {

        dfs(root, root.val);

        return count;
    }
}
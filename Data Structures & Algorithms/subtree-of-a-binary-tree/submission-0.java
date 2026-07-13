class Solution {

    public boolean same(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val != q.val)
            return false;

        return same(p.left, q.left) &&
               same(p.right, q.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null)
            return false;

        if (same(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
}
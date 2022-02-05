package com.github.cookieandcoke;

/**
 * 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/
 */
public class Q101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left==null && right==null) return true;

        if(left==null || right==null) return false;
        else if(left.val != right.val) return false;
        return isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left);
    }
}

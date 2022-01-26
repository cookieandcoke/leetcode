package com.github.cookieandcoke;

/**
 * 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class Q98 {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long min, long max) {
        if(node==null) return true;
        if(node.val>=max || node.val<=min) return false;
        else return valid(node.left, min, node.val) && valid(node.right, node.val, max);
    }
}

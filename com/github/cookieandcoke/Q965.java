package com.github.cookieandcoke;

/**
 * 965. Univalued Binary Tree
 * https://leetcode.com/problems/univalued-binary-tree/
 */
public class Q965 {
    public boolean isUnivalTree(TreeNode root) {
        if(root.left==null && root.right==null) return true;
        return isSameVal(root, root.val);
    }

    private boolean isSameVal(TreeNode root, int val) {
        if(root==null) return true;
        if(root.val != val) return false;
        return isSameVal(root.left, root.val)
                && isSameVal(root.right, root.val);
    }
}

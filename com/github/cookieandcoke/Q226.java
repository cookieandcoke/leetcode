package com.github.cookieandcoke;

/**
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;

        TreeNode node=root.right;
        root.right=invertTree(root.left);
        root.left=invertTree(node);
        return root;
    }
}

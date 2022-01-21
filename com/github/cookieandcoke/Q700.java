package com.github.cookieandcoke;

/**
 * 700. Search in a Binary Search Tree
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class Q700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;

        if(root.val==val) return root;
        else if(root.val < val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }
}

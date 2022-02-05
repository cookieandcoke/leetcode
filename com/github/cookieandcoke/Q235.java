package com.github.cookieandcoke;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class Q235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>root.val && q.val>root.val)
            return lowestCommonAncestor(root.right, p, q);
        else if(p.val<root.val && q.val<root.val)
            return lowestCommonAncestor(root.left, p, q);
        else return root;
    }
}

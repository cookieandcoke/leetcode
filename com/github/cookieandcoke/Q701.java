package com.github.cookieandcoke;

/**
 * 701. Insert into a Binary Search Tree
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */
public class Q701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);

        TreeNode ptr=root;
        while(true) {
            if(val > ptr.val) {
                if(ptr.right==null) {
                    ptr.right=new TreeNode(val);
                    break;
                }
                else ptr=ptr.right;
            }
            else {
                if(ptr.left==null) {
                    ptr.left=new TreeNode(val);
                    break;
                }
                else ptr=ptr.left;
            }
        }
        return root;
    }
}

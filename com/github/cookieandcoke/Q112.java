package com.github.cookieandcoke;

/**
 * 112. Path Sum
 * https://leetcode.com/problems/path-sum/
 */
public class Q112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;

        if(root.left==null && root.right==null) {
            return targetSum-root.val == 0;
        }
        return hasPathSum(root.left, targetSum-root.val)
                || hasPathSum(root.right, targetSum-root.val);
    }
}

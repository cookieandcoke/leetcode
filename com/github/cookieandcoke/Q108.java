package com.github.cookieandcoke;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length-1);
    }

    private TreeNode build(int[] nums, int l, int r) {
        if(r<l) return null;

        int m=l+(r-l)/2;
        TreeNode root=new TreeNode(nums[m]);
        root.left=build(nums, l, m-1);
        root.right=build(nums, m+1, r);
        return root;
    }
}

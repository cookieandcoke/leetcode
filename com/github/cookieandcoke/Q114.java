package com.github.cookieandcoke;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 114. Flatten Binary Tree to Linked List
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class Q114 {
    public void flatten(TreeNode root) {
        if(root == null) return;
        if(root.left==null && root.right==null) return;

        Queue<TreeNode> q=new LinkedList<>();
        preorderToQueue(root, q);
        TreeNode ptr=root;
        while(!q.isEmpty()) {
            ptr.left=null;
            ptr.right=q.poll();
            ptr=ptr.right;
        }
    }

    private void preorderToQueue(TreeNode root, Queue<TreeNode> queue) {
        if(root==null) return;

        queue.add(root);
        if(root.left!=null) preorderToQueue(root.left, queue);
        if(root.right!=null) preorderToQueue(root.right, queue);
    }
}

package com.github.cookieandcoke;

import java.util.*;

/**
 * 102. Binary Tree Level Order Traversal
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()) {
            int size=qu.size();
            List<Integer> level = new ArrayList<>(size);
            for(int i=0; i<size; i++) {
                TreeNode n = qu.poll();
                level.add(n.val);
                if(n.left!=null) qu.add(n.left);
                if(n.right!=null) qu.add(n.right);
            }
            res.add(level);
        }
        return res;
    }
}

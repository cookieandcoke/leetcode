package com.github.cookieandcoke;

import java.util.*;

/**
 * 637. Average of Levels in Binary Tree
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class Q637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Double> r=new ArrayList<>();
        while(!q.isEmpty()) {
            int c=q.size(); double sum=0;
            for(int i=0; i<c; i++) {
                TreeNode n=q.poll();
                sum += n.val;
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            r.add(sum/c);
        }
        return r;
    }
}

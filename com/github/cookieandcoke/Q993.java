package com.github.cookieandcoke;

import java.util.*;

/**
 * 993. Cousins in Binary Tree
 * https://leetcode.com/problems/cousins-in-binary-tree/
 */
public class Q993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int c=q.size();
            boolean isX=false, isY=false;
            for(int i=0; i<c; i++) {
                TreeNode n=q.poll();
                if(n.val == x) isX=true;
                else if(n.val == y) isY=true;

                if(n.left != null && n.right != null) {
                    if(n.left.val==x && n.right.val==y) return false;
                    else if(n.left.val==y && n.right.val==x) return false;
                }
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            if(isX && isY) return true;
        }
        return false;
    }
}

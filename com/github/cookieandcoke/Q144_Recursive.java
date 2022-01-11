package com.github.cookieandcoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class Q144_Recursive {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<>(0);
        if(root.left==null && root.right==null)
            return Collections.singletonList(root.val);

        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return  res;
    }
}

package com.github.cookieandcoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<>(0);
        if(root.left==null && root.right==null)
            return Collections.singletonList(root.val);

        List<Integer> res = new ArrayList<>();
        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));
        return res;
    }
}

package com.github.cookieandcoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 145. Binary Tree Postorder Traversal
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class Q145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<>(0);
        if(root.left==null && root.right==null)
            return Collections.singletonList(root.val);

        List<Integer> res = new ArrayList<>();
        res.addAll(postorderTraversal(root.left));
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }
}

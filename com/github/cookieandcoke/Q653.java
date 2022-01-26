package com.github.cookieandcoke;

import java.util.*;

/**
 * 653. Two Sum IV - Input is a BST
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class Q653 {
    public boolean findTarget(TreeNode root, int k) {
        return find(root, new HashSet<>(), k);
    }

    private boolean find(TreeNode node, Set<Integer> set, int k) {
        if(node==null) return false;
        if(set.contains(k-node.val)) return true;
        set.add(node.val);
        return find(node.right, set, k) || find(node.left, set, k);
    }
}

package com.github.cookieandcoke;

import java.util.ArrayList;
import java.util.List;

/**
 * 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class Q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int [] c1 = new int[1001];
        int [] c2 = new int[1001];

        for(int v : nums1) c1[v]++;
        for(int v : nums2) c2[v]++;

        List<Integer> res = new ArrayList<>();
        for(int i=0; i<1001; i++) {
            int a=Math.min(c1[i],c2[i]);
            for(int j=1; j<=a; j++)
                res.add(i);
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}

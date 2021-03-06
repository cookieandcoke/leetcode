package com.github.cookieandcoke;

/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m+n-1;
        m--;
        n--;
        while(m>=0 && n>=0) {
            nums1[i--] = (nums2[n]>nums1[m]) ? nums2[n--]: nums1[m--];
        }
        while(n>=0) {
            nums1[i--] = nums2[n--];
        }
    }
}

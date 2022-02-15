package com.github.cookieandcoke;

/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Q26 {
    public int removeDuplicates(int[] nums) {
        int k=1, n=nums[0];
        for(int i=1; i<nums.length; i++) {
            if(n==nums[i])
                continue;
            nums[k++]=nums[i];
            n=nums[i];
        }
        return k;
    }
}

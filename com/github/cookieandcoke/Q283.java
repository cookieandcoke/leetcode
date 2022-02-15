package com.github.cookieandcoke;

/**
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 */
public class Q283 {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                nums[k]=nums[i];
                k++;
            }
        }
        if(k<nums.length) {
            for(int i=k; i<nums.length; i++) {
                nums[i]=0;
            }
        }
    }
}

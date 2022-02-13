package com.github.cookieandcoke;

/**
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 */
public class Q268 {
    public int missingNumber(int[] nums) {
        int s=(1+nums.length)*nums.length/2;
        int r=0;
        for(int num : nums) r += num;
        return s-r;
    }
}

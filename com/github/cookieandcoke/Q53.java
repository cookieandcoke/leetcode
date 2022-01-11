package com.github.cookieandcoke;

/**
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 */
public class Q53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}

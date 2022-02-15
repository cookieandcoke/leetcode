package com.github.cookieandcoke;

/**
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/
 * Boyer–Moore majority vote algorithm
 */
public class Q169 {
    public int majorityElement(int[] nums) {
        int v=0, c=0;
        for(int n : nums) {
            if(c==0) {
                v=n;
                c=1;
            } else
                c=(n!=v)? c-1: c+1;
        }
        return v;
    }
}

package com.github.cookieandcoke;

/**
 * 191. Number of 1 Bits
 * https://leetcode.com/problems/number-of-1-bits/
 * Hamming weight
 */
public class Q191 {
    public int hammingWeight_mask(int n) {
        int r=0, m=1;
        for(int i=0; i<=31; i++) {
            if((n&m) != 0) r++;
            m=m<<1;
        }
        return r;
    }

    public int hammingWeight_fast(int n) {
        int r=0;
        while(n!=0) {
            n=n&(n-1);
            r++;
        }
        return r;
    }
}

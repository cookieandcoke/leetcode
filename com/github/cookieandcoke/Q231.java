package com.github.cookieandcoke;

/**
 * 231. Power of Two
 * https://leetcode.com/problems/power-of-two/
 */
public class Q231 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;

        n=n&(n-1);
        return n==0;
    }
}

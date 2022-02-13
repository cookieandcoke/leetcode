package com.github.cookieandcoke;

/**
 * 326. Power of Three
 * https://leetcode.com/problems/power-of-three/
 */
public class Q326 {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;

        while(n>1) {
            if(n%3!=0) return false;
            n /= 3;
        }
        return true;
    }
}

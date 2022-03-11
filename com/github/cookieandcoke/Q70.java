package com.github.cookieandcoke;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 */
public class Q70 {
    public int climbStairs(int n) {
        int a=0,b=1,r=0;
        while(n>0) {
            r=a+b;
            a=b;
            b=r;
            n--;
        }
        return r;
    }
}

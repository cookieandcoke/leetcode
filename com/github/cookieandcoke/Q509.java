package com.github.cookieandcoke;

/**
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 */
public class Q509 {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        int a=0, b=0, r=0;
        for(int i=1; i<=n; i++) {
            if(i==1)
                a=0;
            if(i==2)
                b=1;
            r=a+b;
            a=b;
            b=r;
        }
        return r;
    }
}

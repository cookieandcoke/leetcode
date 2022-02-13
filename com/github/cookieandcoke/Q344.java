package com.github.cookieandcoke;

/**
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/
 * In-place algorithm
 */
public class Q344 {
    public void reverseString(char[] s) {
        int i=s.length, l=0, r=i-1;
        while(l<=r) {
            char c=s[r];
            s[r]=s[l];
            s[l]=c;
            l++;
            r--;
        }
    }
}

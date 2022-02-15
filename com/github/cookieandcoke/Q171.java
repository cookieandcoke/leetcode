package com.github.cookieandcoke;

/**
 * 171. Excel Sheet Column Number
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class Q171 {
    public int titleToNumber(String columnTitle) {
        char[] cs=columnTitle.toCharArray();
        int r=0;
        for(int i=cs.length-1; i>=0; i--) {
            int n=(int)cs[i] - 64;
            n=n*(int)Math.pow(26, cs.length-1-i);
            r+=n;
        }
        return r;
    }
}

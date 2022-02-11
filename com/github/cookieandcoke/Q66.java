package com.github.cookieandcoke;

/**
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 */
public class Q66 {
    public int[] plusOne(int[] digits) {
        boolean carry=false;
        digits[digits.length-1]++;

        int i=digits.length-1;
        while (i>=0) {
            if(carry) digits[i]++;
            carry=digits[i]>=10;
            digits[i]%=10;
            i--;
        }
        if(carry) {
            int[] res=new int[digits.length+1];
            System.arraycopy(digits, 0, res, 1, digits.length);
            res[0]=1; res[1]%=10;
            return res;
        } else return digits;
    }
}

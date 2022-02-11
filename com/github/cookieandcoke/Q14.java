package com.github.cookieandcoke;

/**
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        String r=strs[0];
        for(int i=1; i<strs.length; i++) {
            int l=r.length();
            while(l>0) {
                r=r.substring(0, l);
                if(strs[i].startsWith(r)) {
                    break;
                }
                l--;
            }
            if(l==0) return "";
        }
        return r;
    }
}

package com.github.cookieandcoke;

/**
 * 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 */
public class Q28 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;

        int max=haystack.length()-needle.length();
        for(int i=0; i<=max ;i++) {
            int k=i;
            for(int j=0; j<needle.length(); j++) {
                if(haystack.charAt(k) != needle.charAt(j)) break;
                else k++;

                if(j==needle.length()-1) return i;
            }
        }
        return -1;
    }
}

package com.github.cookieandcoke;

/**
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class Q387 {
    public int firstUniqChar(String s) {
        for(char c: s.toCharArray()) {
            int idx=s.indexOf(c);
            if(idx==s.lastIndexOf(c))
                return idx;
        }
        return -1;
    }
}

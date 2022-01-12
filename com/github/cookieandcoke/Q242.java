package com.github.cookieandcoke;

/**
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 */
public class Q242 {
    public boolean isAnagram(String s, String t) {
        int[] sc=new int[26], tc=new int[26];
        for(char c: s.toCharArray()) sc[c-'a']++;
        for(char c: t.toCharArray()) tc[c-'a']++;

        for(int i=0; i<26; i++)
            if(sc[i]!=tc[i]) return false;
        return true;
    }
}

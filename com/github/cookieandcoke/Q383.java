package com.github.cookieandcoke;

/**
 * 383. Ransom Note
 * https://leetcode.com/problems/ransom-note/
 */
public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr1=new int[26], arr2=new int[26];
        for(char c: ransomNote.toCharArray()) arr1[c-'a']++;
        for(char c: magazine.toCharArray()) arr2[c-'a']++;

        for(int i=0; i<26; i++)
            if(arr1[i]>arr2[i]) return false;
        return true;
    }
}

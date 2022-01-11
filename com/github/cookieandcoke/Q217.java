package com.github.cookieandcoke;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return s.size() < nums.length;
    }
}

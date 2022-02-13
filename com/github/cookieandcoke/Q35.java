package com.github.cookieandcoke;

/**
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 */
public class Q35 {
    public int searchInsert(int[] nums, int target) {
        if(target <= nums[0]) return 0;
        if(target > nums[nums.length-1]) return nums.length;

        int l=0, r=nums.length, m=0;
        while(l<=r) {
            m=l+(r-l)/2;
            if(target == nums[m])
                return m;
            else if(target > nums[m])
                l=m+1;
            else
                r=m-1;
        }
        return nums[m]<target ? m+1 : m;
    }
}

package com.github.cookieandcoke;

import java.util.Arrays;

/**
 * 74. Search a 2D Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class Q74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0, c=matrix[0].length-1;
        while(r <= matrix.length) {
            if(r==matrix.length) return false;
            if(target > matrix[r][c]) r++;
            else if(target == matrix[r][c]) return true;
            else break;
        }

        int idx=Arrays.binarySearch(matrix[r], target);
        return idx >= 0;
    }
}

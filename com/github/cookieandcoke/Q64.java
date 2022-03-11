package com.github.cookieandcoke;

/**
 * 64. Minimum Path Sum
 * https://leetcode.com/problems/minimum-path-sum/
 */
public class Q64 {
    public int minPathSum(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int [][] sum = new int[m][n];

        sum[0][0]=grid[0][0];
        for(int i=1; i<m; i++)
            sum[i][0]=sum[i-1][0]+grid[i][0];
        for(int j=1; j<n; j++)
            sum[0][j]=sum[0][j-1]+grid[0][j];

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                int min= Math.min(sum[i-1][j], sum[i][j-1]);
                sum[i][j]=min+grid[i][j];
            }
        }
        return sum[m-1][n-1];
    }
}

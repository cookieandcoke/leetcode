package com.github.cookieandcoke;

/**
 * 566. Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/
 */
public class Q566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int size = mat[0].length * mat.length;
        if(size != r*c) {
            return mat;
        }

        int [][] res = new int[r][c];
        int a=0,b=0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(b==c){
                    a++;
                    b=0;
                }
                res[a][b] = mat[i][j];
                b++;
            }
        }
        return res;
    }
}

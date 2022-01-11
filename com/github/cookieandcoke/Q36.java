package com.github.cookieandcoke;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku
 * https://leetcode.com/problems/valid-sudoku/
 */
public class Q36 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j]=='.') continue;

                String r="r-"+i+board[i][j];
                if(!set.add(r)) return false;
                String c="c-"+j+board[i][j];
                if(!set.add(c)) return false;
                int k=(i/3)*3+(j/3);
                String b="b-"+k+board[i][j];
                if(!set.add(b)) return false;
            }
        }
        return true;
    }
}

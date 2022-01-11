package com.github.cookieandcoke;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 */
public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);
        for(int i=1; i<=numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=1; j<=i; j++) {
                if(j==1 || j==i)
                    row.add(1);
                else
                    row.add(res.get(i-2).get(j-2)+res.get(i-2).get(j-1));
            }
            res.add(row);
        }
        return res;
    }
}

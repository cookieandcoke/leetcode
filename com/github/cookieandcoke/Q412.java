package com.github.cookieandcoke;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/
 */
public class Q412 {
    public List<String> fizzBuzz(int n) {
        List<String> r=new ArrayList<>(n);
        for(int i=1; i<=n; i++) {
            if(i%15 == 0)
                r.add("FizzBuzz");
            else if(i%5 == 0)
                r.add("Buzz");
            else if(i%3 == 0)
                r.add("Fizz");
            else
                r.add(i+"");
        }
        return r;
    }
}

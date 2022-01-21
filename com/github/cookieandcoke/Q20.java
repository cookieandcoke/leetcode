package com.github.cookieandcoke;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()) {
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            else {
                if(stack.isEmpty()) return false;

                char p=stack.pop();
                if (c==')') {
                    if(p!='(') return false;
                } else if(c=='}') {
                    if(p!='{') return false;
                } else {
                    if(p!='[') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

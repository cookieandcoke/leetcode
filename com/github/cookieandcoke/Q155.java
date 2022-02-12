package com.github.cookieandcoke;

import java.util.Stack;

/**
 * 155. Min Stack
 * https://leetcode.com/problems/min-stack/
 */
public class Q155 {
    class MinStack {
        Stack<Integer> vStack;
        Stack<Integer> mStack;

        public MinStack() {
            vStack=new Stack<>();
            mStack=new Stack<>();
        }

        public void push(int val) {
            vStack.push(val);
            if(mStack.isEmpty()) mStack.push(val);
            else mStack.push(Math.min(mStack.peek(), val));
        }

        public void pop() {
            vStack.pop();
            mStack.pop();
        }

        public int top() {
            return vStack.peek();
        }

        public int getMin() {
            return mStack.peek();
        }
    }
}

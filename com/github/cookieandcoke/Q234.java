package com.github.cookieandcoke;

import java.util.Stack;

/**
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class Q234 {
    public boolean isPalindrome_string(ListNode head) {
        StringBuilder l= new StringBuilder();
        StringBuilder r= new StringBuilder();
        while(head.next != null) {
            l.append(head.val);
            r.insert(0, head.val);
            head=head.next;
        }
        return l.toString().equals(r.toString());
    }

    public boolean isPalindrome_stack(ListNode head) {
        ListNode prev=new ListNode(), sptr=prev, fptr=prev;
        prev.next=head;
        Stack<Integer> stack=new Stack<>();

        while(fptr.next!=null) {
            sptr=sptr.next;
            stack.push(sptr.val);
            fptr=fptr.next.next;
            if(fptr==null) {
                stack.pop();
                break;
            }
        }

        sptr=sptr.next;
        while(!stack.isEmpty()) {
            if(sptr.val != stack.pop()) return false;
            sptr=sptr.next;
        }
        return true;
    }
}

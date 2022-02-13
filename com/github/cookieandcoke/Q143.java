package com.github.cookieandcoke;

import java.util.Stack;

/**
 * 143. Reorder List
 * https://leetcode.com/problems/reorder-list/
 */
public class Q143 {
    public void reorderList(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        int c=0;
        ListNode ptr=head;
        while(ptr!=null) {
            s.push(ptr);
            ptr=ptr.next;
            c++;
        }

        ptr=head;
        for(int i=1; i<c; i+=2) {
            ListNode node=ptr.next;
            ptr.next=s.pop();
            ptr.next.next=node;
            ptr=node;
        }
        ptr.next=null;
    }
}

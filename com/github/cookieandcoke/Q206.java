package com.github.cookieandcoke;

/**
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class Q206 {
    public ListNode reverseList(ListNode head) {
        ListNode ptr=head, prev=null, next;
        while(ptr != null) {
            if(ptr.next == null) {
                ptr.next=prev;
                return ptr;
            }
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return null;
    }
}

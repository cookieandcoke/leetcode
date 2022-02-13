package com.github.cookieandcoke;

/**
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Fast and Slow Pointer
 */
public class Q876 {
    public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;

        ListNode sptr=head, fptr=head;
        while(true) {
            if(fptr.next==null) break;
            if(fptr.next.next==null) {
                sptr=sptr.next;
                break;
            }
            sptr=sptr.next;
            fptr=fptr.next.next;
        }
        return sptr;
    }
}

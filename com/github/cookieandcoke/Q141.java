package com.github.cookieandcoke;

/**
 * 141. Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/
 * Floyd's Cycle-Finding Algorithm
 */
public class Q141 {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;

        ListNode sptr=head, fptr=head;
        do {
            if(fptr==null || fptr.next==null)
                return false;
            sptr=sptr.next;
            fptr=fptr.next.next;
        } while(sptr != fptr);

        return true;
    }
}

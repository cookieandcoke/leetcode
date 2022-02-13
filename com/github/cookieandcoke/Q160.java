package com.github.cookieandcoke;

/**
 * 160. Intersection of Two Linked Lists
 * https://leetcode.com/problems/intersection-of-two-linked-lists
 */
public class Q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aptr=headA, bptr=headB;
        while(aptr!=bptr) {
            aptr=(aptr==null)? headB: aptr.next;
            bptr=(bptr==null)? headA: bptr.next;
        }
        return aptr;
    }
}

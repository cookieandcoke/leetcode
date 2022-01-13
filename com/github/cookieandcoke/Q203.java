package com.github.cookieandcoke;

/**
 * 203. Remove Linked List Elements
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode();
        ListNode ptr = head, prev = res;
        res.next = head;

        while(ptr!=null){
            if(ptr.val==val) prev.next=ptr.next;
            else prev = ptr;
            ptr = ptr.next;
        }
        return res.next;
    }
}

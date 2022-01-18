package com.github.cookieandcoke;

/**
 * 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class Q83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode ptr=head.next, prev=head;
        while(ptr != null) {
            if(ptr.val == prev.val)
                prev.next=ptr.next;
            else
                prev=ptr;
            ptr=ptr.next;
        }
        return head;
    }
}

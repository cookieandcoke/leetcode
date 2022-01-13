package com.github.cookieandcoke;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class Q21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode ptr = res;
        while(list1!=null && list2!=null) {
            if(list1.val < list2.val) {
                ptr.next = list1;
                list1 = list1.next;
                ptr = ptr.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
                ptr = ptr.next;
            }
        }
        ptr.next = (list1==null) ? list2: list1;

        return res.next;
    }
}

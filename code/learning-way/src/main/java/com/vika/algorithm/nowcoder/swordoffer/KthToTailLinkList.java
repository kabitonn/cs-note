package com.vika.algorithm.nowcoder.swordoffer;

import  com.vika.algorithm.datastructure.ListNode;

public class KthToTailLinkList {

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode fast = head;
        int step = 0;
        while (fast != null && step < k) {
            fast = fast.next;
            step++;
        }
        if (step < k) {
            return null;
        }
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

package com.vika.algorithm.leetcode.easy.S201_300;


import com.vika.algorithm.leetcode.common.ListNode;

public class S237DeleteLinkNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void deleteNode(ListNode node) {
    	node.val = node.next.val;
        node.next = node.next.next;
    }
}

package com.lastisee.java.leetcode;

public class Solution2 {
    public ListNode deleteAllSameElement(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
       //加了虚拟头结点，不需要对头结点的元素进行特殊处理
        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }
}

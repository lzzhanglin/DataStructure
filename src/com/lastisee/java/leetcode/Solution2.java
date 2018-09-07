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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        (new Solution2()).deleteAllSameElement(head, 5);
        System.out.println(head);
    }
}

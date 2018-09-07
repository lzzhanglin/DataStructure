package com.lastisee.java.leetcode;

public class Solution3 {
    public ListNode deleteAllSameElement(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = deleteAllSameElement(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        (new Solution3()).deleteAllSameElement(head, 5);
        System.out.println(head);
    }
}

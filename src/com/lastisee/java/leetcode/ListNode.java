package com.lastisee.java.leetcode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {

        val = x;
    }

    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array can't empty");
        }
        this.val = arr[0];
        ListNode current = this;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val+"-->");
            current = current.next;
        }
        sb.append("NULL");
        return sb.toString();
    }

}

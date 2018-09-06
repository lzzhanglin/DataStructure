package com.lastisee.java.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 9; i >= 0; i--) {
            linkedList.addElementAtFirst(i);
        }
        System.out.println(linkedList);
        linkedList.deleteElementAtFirst();
        linkedList.deleteElementAtLast();
        System.out.println(linkedList);
    }
}

package com.lastisee.java.linkedlist;


import java.util.Objects;

public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    public void addElement(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Illegal index");
        }

            Node prev = dummyHead;
            for (int i =0; i < index; i++) {
                prev = prev.next;
            }
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
            prev.next = new Node(e, prev.next);
            size++;


    }

    public void addElementAtFirst(E e) {
         addElement(0, e);
    }

    public void addElementAtLast(E e) {
        addElement(size, e);
    }

    public E getElementByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Illegal index");
        }
        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.e;
    }

    public E getElementAtFirst() {
        return getElementByIndex(0);
    }

    public E getElementAtLast() {
        return getElementByIndex(size - 1);
    }

    public void updateElementByIndex(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Illegal index");
        }
        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.e = e;
    }

    public boolean isContains(E e) {
        Node current = dummyHead.next;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(current.e, e)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void deleteElementByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException(" Illegal index");
        }
        Node prev = dummyHead;
        for (int i = 0; i <= index -1; i++) {
            prev = prev.next;
        }
        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
//        prev.next = prev.next.next;
    }

    public void deleteElementAtFirst() {
        deleteElementByIndex(0);
    }

    public void deleteElementAtLast() {
        deleteElementByIndex(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        Node current = dummyHead.next;
//        while (current != null) {
//            sb.append(current.e + "-->");
//            current = current.next;
//       }
        for (Node current = dummyHead.next; current != null; current = current.next) {
            sb.append(current + "--> ");
        }
        sb.append("NULL");
        return sb.toString();
    }

    private int getCurrentSize() {
        int size = 0;
        for (Node current = dummyHead.next; current != null; current = current.next) {
            size++;
        }
        return size;
    }

}

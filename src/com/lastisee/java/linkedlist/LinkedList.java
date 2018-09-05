package com.lastisee.java.linkedlist;

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
        size++;
    }

    public void addElementAtLast(E e) {
        addElement(size, e);
    }
}

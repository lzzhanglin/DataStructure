package com.lastisee.java.queue;

import com.lastisee.java.stack.LinkedList;

public class LinkedListQueue<E> implements Queue<E> {

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

    private Node head,tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enQueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        Node deNode = head;
        head = head.next;
        deNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return deNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Queue: front ");
        Node current = head;
        while (current != null) {
            result.append(current + "-->");
            current = current.next;
        }
        result.append("NULL tail");
        return result.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enQueue(i);
            if (i % 3 == 2) {
                queue.deQueue();
                System.out.println(queue);
            }
//            System.out.println(queue.getFront());
        }
        System.out.println(queue);

    }
}

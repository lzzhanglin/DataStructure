package com.lastisee.java.stack;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;
    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return getSize();
    }

    @Override
    public boolean isEmpty() {
        return isEmpty();
    }

    @Override
    public void push(E e) {
        list.addElementAtFirst(e);
    }

    @Override
    public E pop() {
        return list.deleteElementAtFirst();
    }

    @Override
    public E peek() {
        return list.getElementAtFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: top ^ ");
        sb.append(list);
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            linkedListStack.push(i);
        }
        System.out.println(linkedListStack);
        linkedListStack.pop();
        System.out.println(linkedListStack);
    }
}

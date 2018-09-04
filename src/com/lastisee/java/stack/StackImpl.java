package com.lastisee.java.stack;

import com.lastisee.java.array.Array;

public class StackImpl<E> implements Stack<E> {

    Array<E> array;

    public StackImpl(int capacity) {
        array = new Array<>(capacity);
    }

    public StackImpl() {
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void push(E e) {
        array.addElementAtLast(e);
    }

    @Override
    public E pop() {
        return array.deleteLast();
    }

    @Override
    public E peek() {
        return array.getElementLast();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Stack: ");
        result.append("[");
        for (int i =0; i < array.getSize(); i++) {
            result.append(array.getElementByIndex(i));
            if (i != array.getSize() - 1) {
                result.append(", ");
            }
        }
        result.append("] top");
        return result.toString();

    }
}

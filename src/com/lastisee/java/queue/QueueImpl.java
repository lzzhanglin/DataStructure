package com.lastisee.java.queue;

import com.lastisee.java.array.Array;

public class QueueImpl<E> implements Queue<E> {

    private Array<E> array;

    public QueueImpl(int  capacity) {
        array = new Array<>(capacity);
    }

    public QueueImpl() {
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
    public void enQueue(E e) {
        array.addElementAtLast(e);
    }

    @Override
    public E deQueue() {
        return array.deleteFirst();
    }

    @Override
    public E getFront() {
        return array.getElementFirst();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Queue: ");
        result.append("front [");
        for (int i =0; i < array.getSize(); i++) {
            result.append(array.getElementByIndex(i));
            if (i != array.getSize() - 1) {
                result.append(", ");
            }
        }
        result.append("] tail");
        return result.toString();

    }
}

package com.lastisee.java.queue;

public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enQueue(E e);

    E deQueue();

    E getFront();


}

package com.lastisee.java.queue;

public class QueueTest {
    public static void main(String[] args) {
        QueueImpl<Integer> queue = new QueueImpl<>();
        for (int i = 0; i < 15; i++) {
            queue.enQueue(i);
        }
        System.out.println(queue);
        System.out.println(queue.getFront());
        queue.deQueue();
        System.out.println(queue);
        System.out.println("**********************");
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            loopQueue.enQueue(i);
            System.out.println(loopQueue);
            if (i % 3 == 2) {
                loopQueue.deQueue();
                System.out.println("----------");
                System.out.println(loopQueue);
            }
        }
//        System.out.println(loopQueue);
//        System.out.println(loopQueue.getFront());
//        loopQueue.deQueue();
//        System.out.println(loopQueue);

    }
}

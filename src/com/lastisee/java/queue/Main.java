package com.lastisee.java.queue;

public class Main {

    private static double testQueue(Queue<Integer> queue, int opCount) {
        Long dateBegin = System.currentTimeMillis();
        for (int i = 0; i < opCount; i++){
            queue.enQueue(i);
        }
        for (int i = 0; i < opCount; i++) {
            queue.deQueue();
        }
        Long dateEnd = System.currentTimeMillis();
        double time = dateEnd - dateBegin;
        return time;
    }
    public static void main(String[] args) {
        int opCount = 100000;
        QueueImpl<Integer> queue = new QueueImpl<>();
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        double time1 = testQueue(queue, opCount);
        double time2 = testQueue(loopQueue, opCount);
        double time3 = testQueue(linkedListQueue, opCount);
        System.out.println("time1 is: " + time1 + " time2 is: " + time2 + " time3 is: " + time3);


    }
}

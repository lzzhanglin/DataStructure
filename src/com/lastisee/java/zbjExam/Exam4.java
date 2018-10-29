package com.lastisee.java.zbjExam;

public class Exam4 {

    public static int count = 0;
    public static final Object LOCK = new Object();
    public static void main(String[] args) throws Exception{


        Thread t1 = new AddThread();
        Thread t2 = new AddThread();
        Thread t3 = new AddThread();
        Thread t4 = new AddThread();
        Thread t5 = new AddThread();
        Thread t6 = new DecThread();
        Thread t7 = new DecThread();
        Thread t8 = new DecThread();
        Thread t9 = new DecThread();
//        Thread t10 = new DecThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
//        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
//        t10.join();
        System.out.println(count);

    }

}

class AddThread extends Thread{
        public void run(){
            for (int i = 0; i < 10000; i++) {
                synchronized (Exam4.LOCK) {
                    Exam4.count +=1;

                }
            }
        }

}

class DecThread extends Thread{
    public void run(){
        for (int i = 0; i < 10000; i++) {
            synchronized (Exam4.LOCK) {
                Exam4.count -=1;

            };
        }
    }

}


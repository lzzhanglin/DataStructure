package com.lastisee.java.leetcode;

import sun.text.resources.cldr.om.FormatData_om;

public class MultiThread implements Runnable {
    private String name;

    public MultiThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("runnable线程在执行"+name);
    }

    public static void main(String[] args) {
        MultiThread t6 = new MultiThread("6");
        MultiThread t7 = new MultiThread("7");
        MultiThread t8 = new MultiThread("8");
        MultiThread t9 = new MultiThread("9");
        MultiThread t10 = new MultiThread("10");
        Thread thread6 = new Thread(t6);
        Thread thread7 = new Thread(t7);
        Thread thread8 = new Thread(t8);
        Thread thread9 = new Thread(t9);
        Thread thread10 = new Thread(t10);
        MulThread t1 = new MulThread("1");
        MulThread t2 = new MulThread("2");
        MulThread t3 = new MulThread("3");
        MulThread t4 = new MulThread("4");
        MulThread t5 = new MulThread("5");
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);
        thread10.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("哈哈哈哈");

        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();




    }


}

class MulThread extends Thread {

    private String name;

    public MulThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("继承的thread在执行"+name);
    }
}

package com.lastisee.java.stack;

import java.util.LinkedList;

public class Main {
    private static double testStack(Stack<Integer> stack, int opCount) {
        Long dateBegin = System.currentTimeMillis();
        for (int i = 0; i < opCount; i++){
            stack.push(i);
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        Long dateEnd = System.currentTimeMillis();
        double time = dateEnd - dateBegin;
        return time;
    }
    public static void main(String[] args) {
        int opCount = 100000;
        StackImpl<Integer> stack = new StackImpl<>();
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time1 = testStack(stack, opCount);
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("time1 is: " + time1 + " time2 is: " + time2);


    }
}

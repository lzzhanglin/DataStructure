package com.lastisee.java.array;

import java.util.Iterator;

public class Array {
   private int[] data;
   private int size;

    /**
     *
     * 构造函数
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }
}

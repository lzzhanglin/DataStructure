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

    /**
     * 默认构造函数
     */
    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addElementAtLast(int element) {
        addElementByIndex(size,element);
    }

    public void addElementAtFirst(int element) {
        addElementByIndex(0,element);
    }

    public void addElementByIndex(int index, int element) {
        if (size == data.length  || index < 0 || index > size) {
            throw new IllegalArgumentException("addElement failed!");
        }
        for (int i = size - 1; i > index -1; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;

    }

    public int getElementByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is out of size");
        }
        return data[index];
    }

    public void updateElementByIndex(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is out of size");
        }
        data[index] = element;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        result.append("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i != size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

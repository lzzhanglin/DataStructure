package com.lastisee.java.array;

import java.util.Iterator;
import java.util.Objects;

public class Array<E> {
   private E[] data;
   private int size;

    /**
     *
     * 构造函数
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[])new Object[capacity];
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

    public void addElementAtLast(E element) {
        addElementByIndex(size,element);
    }

    public void addElementAtFirst(E element) {
        addElementByIndex(0,element);
    }

    public void addElementByIndex(int index, E element) {
        if ( index < 0 || index > size) {
            throw new IllegalArgumentException("addElement failed!");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size - 1; i > index -1; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;

    }

    public E getElementByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is out of size");
        }
        return data[index];
    }

    public E getElementFirst() {
        return data[0];
    }

    public E getElementLast() {
        return data[size - 1];
    }

    public void updateElementByIndex(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is out of size");
        }
        data[index] = element;
    }

    public boolean containsElement(E element) {
        for(int i = 0; i < size; i++) {
            if (Objects.equals(data[i], element)) {
                return true;
            }
        }
        return false;
    }

    public int findIndex(E element) {
        //只能用size 若用length 空的数组元素默认值为0 即使数组内不存在为0的元素，也会判断为存在
        for (int i = 0; i < size; i++) {
            if (Objects.equals(data[i], element)) {
                return i;
            }
        }
        throw new IllegalArgumentException("this element is not found");

    }

    public E deleteElementByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("index is out of arrar's length");
        }
        E delete = getElementByIndex(index);
        //这种方式将原来末尾的元素给置为默认值0
//        for (int i = index; i < size; i++) {
//            data[i] = data[i + 1];
//        }
        //这种方式对末尾的元素不处理，由于size-- 用户对最后那个未处理的元素不可见，所以无影响
        for (int i = index+1;i<size;i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if (size == data.length / 4 && data.length/2 != 0) {
            resize(data.length / 2);
        }
        return delete;
    }

    public E deleteFirst() {
        return deleteElementByIndex(0);
    }

    public E deleteLast() {
        return deleteElementByIndex(size - 1);
    }

    public void deleteElement(E element) {
        int index = findIndex(element);
        deleteElementByIndex(index);
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

    private void resize(int size) {
        E[] newData = (E[])new Object[size];
        for (int i = 0; i < size / 2; i++) {
            newData[i] = data[i];
        }
        data = newData;

    }
}

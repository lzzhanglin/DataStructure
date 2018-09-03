package com.lastisee.java.array;

import com.lastisee.java.array.Array;
public class ArrayTest {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for(int i = 0; i < 10; i++) {
            arr.addElementAtLast(i);
        }
        arr.addElementByIndex(1,391);
        System.out.println(arr);


    }

}

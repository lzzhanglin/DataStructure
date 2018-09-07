package com.lastisee.java.exam;
import java.util.HashMap;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("请输入n,k,t的值,以英文逗号分隔:");
        String input1[] = str.next().split(",");
        Integer n = Integer.valueOf(input1[0]);
        Integer k = Integer.valueOf(input1[1]);
        Integer t = Integer.valueOf(input1[2]);
        Scanner str1 = new Scanner(System.in);
        System.out.println("请输入"+n+"位数组元素,以英文逗号分隔");
        String  input2[] = str1.next().split(",");
        int length = input2.length;
        if (length != n) {
            throw new IllegalArgumentException("输入的数组元素个数有误");
        }
        int[] source = new int[n+1];
        for (int i = 0 ; i < input2.length; i++ ) {
            source[i] = Integer.valueOf(input2[i]);
        }
        int sum = 0;
        for (int i = 0; i<= n+1-k; i++) {
            int r = k -1 + i;
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int kk = i; kk<=r; kk++) {
                if (map.containsKey(source[kk])) {
                    int count = map.get(source[kk]);
                    count++;
                    map.remove(source[kk]);
                    map.put(source[kk], count);
                } else {
                    map.put(source[kk], 1);

                }
            }
            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= t) {
                    sum++;
                    break;
                }
            }
            System.out.println("--------------");
        }
        System.out.println("sum is: " + sum);

    }
}

package com.lastisee.java.zbjExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[2];
        arr = in.nextLine().split("\\s+");
        int m = Integer.valueOf(arr[0]);
        int n = Integer.valueOf(arr[1]);
        String[] arr1 = new String[n];

        Scanner sc = new Scanner(System.in);
        arr1 = in.nextLine().split("\\s+");
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for (int i =0; i < arr1.length; i++) {
            arrayList.add(Integer.valueOf(arr1[i]));
        }
        for (int i = 1; i < arrayList.size()-1; i+=3) {
            if (arrayList.get(i - 1) == arrayList.get(i)||arrayList.get(i + 1) == arrayList.get(i)) {
                arrayList1.add(0);
                continue;
            }
            int diff = (arrayList.get(i) - arrayList.get(i-1))*(arrayList.get(i) - arrayList.get(i-1));
            arrayList1.add(diff);
        }
        for (int i = 2; i < arrayList.size()-1; i+=3) {
            if (arrayList.get(i - 1) == arrayList.get(i)||arrayList.get(i + 1) == arrayList.get(i)) {
                arrayList2.add(0);
                continue;
            }
            int diff = (arrayList.get(i) - arrayList.get(i-1))*(arrayList.get(i) - arrayList.get(i-1));
            arrayList2.add(diff);
        }
        for (int i = 3; i < arrayList.size()-1; i+=3) {
            if (arrayList.get(i - 1) == arrayList.get(i)||arrayList.get(i + 1) == arrayList.get(i)) {
                arrayList3.add(0);
                continue;
            }
            int diff = (arrayList.get(i) - arrayList.get(i-1))*(arrayList.get(i) - arrayList.get(i-1));
            arrayList3.add(diff);
        }
        for (int num : arrayList1) {
            System.out.print(num+"->");

        }
        System.out.println("");

        for (int num : arrayList2) {
            System.out.print(num+"->");

        }
        System.out.println("");

        for (int num : arrayList3) {
            System.out.print(num+"-->");
        }
        System.out.println("");

        arrayList1.sort(Integer::compareTo);
        System.out.println("***********************");
        for (int num : arrayList1) {
            System.out.print(num+"--");
        }
        System.out.println("***********************");
        arrayList2.sort(Integer::compareTo);
        arrayList3.sort(Integer::compareTo);
        for (int num : arrayList2) {
            System.out.print(num+"-->");
        }
        System.out.println("");
        for (int num : arrayList3) {
            System.out.print(num+"-->");
        }
        System.out.println("");

        int result = 0;
        for (int i =0; i < m;i++) {
            int a1 =0;
            int a2 =0;
            int a3 =0;
            if (arrayList1.size() >= i + 1) {
                a1 = arrayList1.get(i);
            } else {
                a1 = 25000000;
            }
            if (arrayList2.size() >= i + 1) {
                a2 = arrayList2.get(i);
            } else {
                a2 = 25000000;
            }
            if (arrayList3.size() >= i + 1) {
                a3 = arrayList3.get(i);
            } else {
                a3 = 25000000;
            }
            int num1 = Math.min(a1, a2);
            int num2 = Math.min(a2, a3);
            int num3 = Math.min(num1,num2);
            System.out.println(num3);
            result += num3;
        }
        System.out.println("result is: " + result);

    }


}

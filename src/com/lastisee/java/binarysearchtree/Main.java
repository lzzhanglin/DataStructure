package com.lastisee.java.binarysearchtree;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.size() -1; j++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();
                sb.append(arr.get(j));
                sb.append(arr.get(j + 1));
                sb1.append(arr.get(j + 1));
                sb1.append(arr.get(j));

                int r  = Integer.valueOf(sb.toString());
                int r1 = Integer.valueOf(sb1.toString());
                if (r < r1) {
                    int temp = arr.get(j + 1);
                    arr.set(j + 1, arr.get(j));
                    arr.set(j, temp);

                }
            }


        }
        StringBuilder sbb = new StringBuilder();
        for (Integer num : arr) {
            sbb.append(num);
        }
        System.out.println(sbb.toString());

    }
}




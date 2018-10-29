package com.lastisee.java.zbjExam;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[2];
        arr[0] = "12";
        arr[1] = "123";
        arr = in.nextLine().split(":");
        String str1 = arr[0];
        String str2 = arr[1];
        int len1 = arr[0].length();
        int len2 = arr[1].length();
        String[] arr1 = new String[len1];
        String[] arr2 = new String[len2];
        for (int i = 0; i< arr[0].length();i++) {
            arr1[i] = arr[0].substring(i, i + 1);
        }
        for (int i = 0; i< arr[1].length();i++) {
            arr2[i] = arr[1].substring(i, i + 1);
        }

        int len = Math.max(len1, len2);
        int leng = Math.min(len1, len2);
        String[] ch = new String[len+1];

        for (int i = leng-1; i >= 0 ; i--) {
            int sum = Integer.valueOf(arr1[i]) + Integer.valueOf(arr2[i]);
            if (arr1[i].equals(null) &&! arr2[i].equals(null)) {
                ch[i] = arr2[i];
                continue;
            }
            if (arr2[i].equals(null) && !arr1[i].equals(null) ) {
                ch[i] = arr1[i];
                continue;
            }
            if (sum >9 ) {
                ch[i] = "0";
                ch[i + 1] = "1";
            } else {
                ch[i] = String.valueOf(sum);
                if (i > 0) {
                    int number = Integer.valueOf(ch[i]) + Integer.valueOf(ch[i - 1]);
                    ch[i] = String.valueOf(number);

                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len+1; i++) {
            System.out.println(ch[i]);
            sb.append(ch[i]);
        }
        System.out.println(sb.toString());

    }
}

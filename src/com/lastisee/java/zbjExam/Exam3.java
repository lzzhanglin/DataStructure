package com.lastisee.java.zbjExam;

import java.util.HashMap;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for(int i =0; i <= num; i++) {
            String str = Integer.valueOf(i).toString();
            for(int j = 0; j < str.length(); j++) {
                if (str.substring(j, j + 1).equals("1")) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

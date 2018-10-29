package com.lastisee.java.zbjExam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exam1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solve(int d, int w, int all, int N) {
        int num = 0;
        for (int i = 1; i < N;i++){
            num += i;
        }
        int totalWeight = num * w;
        System.out.println("totalWeight is: " + totalWeight);
        int diff = totalWeight - all;
        System.out.println("diff is: " + diff);
        int result = diff/d;

        return result;


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _N;
        _N = Integer.parseInt(in.nextLine().trim());

        int _w;
        _w = Integer.parseInt(in.nextLine().trim());

        int _d;
        _d = Integer.parseInt(in.nextLine().trim());







        int _all;
        _all = Integer.parseInt(in.nextLine().trim());

        res = solve(_d, _w, _all, _N);
        System.out.println(String.valueOf(res));

    }
}

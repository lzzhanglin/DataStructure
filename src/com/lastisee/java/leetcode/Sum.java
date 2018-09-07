package com.lastisee.java.leetcode;

public class Sum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }
//计算arr[l] 到arr[n]的和
    private static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = sum(arr);
        System.out.println(sum);
    }
}

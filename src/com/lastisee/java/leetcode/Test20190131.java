package com.lastisee.java.leetcode;

import com.sun.org.apache.xerces.internal.impl.dv.xs.TypeValidator;

/**
 * @author lzzhanglin
 * @date 2019/1/31 9:35
 */
public class Test20190131 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length;j++){
                if (i != j && nums[i] + nums[j] == target) {
                    if (i > j) {
                        arr[0] = j;
                        arr[1] = i;
                    } else {
                        arr[0] = i;
                        arr[1] = j;
                    }

                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] testArr = {1,2,5,7,12,32,35};
        int target = 39;
        Test20190131 test = new Test20190131();
        int[] resultArr = test.twoSum(testArr, target);
        for (int i : resultArr) {
            System.out.println(i);
        }
    }


}

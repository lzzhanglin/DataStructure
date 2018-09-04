package com.lastisee.java.stack;

import com.lastisee.java.array.Array;

import java.util.Objects;
import java.util.Stack;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class StackTest {
    public static void main(String[] args) {
        StackImpl<Integer> stack = new StackImpl<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        int result = stack.peek();
        System.out.println("top is: " + result);
        String str = "{[[)]}";
//        StackImpl<String> stringStack = new StackImpl<>();
        Stack<String> stringStack = new Stack<>();
        String[] stringArr = new String[10];
        if (str.length() % 2 == 1) {
            System.out.println("close failed");
        } else {
            for(int i = 0; i < str.length(); i++) {
                stringStack.push(substring(str,i, i + 1));
            }
            for (int i = 0; i < str.length() / 2; i++) {
                String resultStr = stringStack.pop();
                stringArr[i] = resultStr;
            }
            boolean flag = false;
            for (int i = str.length() / 2 -1; i >= 0; i--) {
                if (strMatch(stringStack.pop(), stringArr[i])) {
                    flag = true;
                } else {
                    flag = false;
                    System.out.println("close failed");
                    break;
                }
            }
            if (flag) {
                System.out.println("close success");
            }
        }



    }

    public static boolean strMatch(String string1, String string2) {
        String string = new String();
        switch (string1) {
            case "{":
                string = "}";
                break;
            case "[":
                string = "]";
                break;
            case "(":
                string = ")";
                break;
                default:
                    string = "invalid string";
                    break;
        }
        if (Objects.equals(string, string2)) {
            return true;
        } else {
            return false;
        }
    }
}

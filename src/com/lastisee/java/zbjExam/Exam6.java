package com.lastisee.java.zbjExam;


import com.lastisee.java.exam.Exam;

import java.util.ArrayList;
import java.util.Iterator;

public class Exam6 {
    private String name1;
    private String name2;

    public Exam6(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Exam6)) {
            return false;
        }
        Exam6 user = (Exam6)o;
        return name1 == user.name1 && name2 == user.name2;

    }

    public static void main(String[] args) {
        String result = "";
        result += "aaa";
        System.out.println(result);
        Integer integer1 = 99;
        Integer integer2 = 99;
        System.out.println(integer1 == integer2);
        String str = "张林";
        System.out.println(str.length());
        ArrayList<String> arr = new ArrayList<>();
        arr.add("张三");
        arr.add("张三我去");
        arr.add("张三飞");
        arr.add("张三哦");
        arr.add("张三");
        arr.add("张三我我我");
        for (Iterator<String> it = arr.iterator(); it.hasNext(); ) {
            String name = it.next();
            if (name.length() > 2) {
//                arr.remove(name);
            }
        }
    }
}
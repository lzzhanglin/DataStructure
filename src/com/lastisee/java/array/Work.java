package com.lastisee.java.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class Work {
    public static void main(String[] args) {
        int count = 0;
        for (int i =1; i < 101; i++) {
            if (i % 2 == 1)
                count += i;

        }
        System.out.println("count is: " + count);
        //求出输入的日期是当年的多少天
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateStr = "20180903";
        String year = substring(dateStr, 0, 4);
        year += "0101";
        try {
            Date date = sdf.parse(dateStr);
            Date date1 = sdf.parse(year);
            Long diff = date.getTime() - date1.getTime();
            Long day = diff / 86400000 + 1;
            System.out.println("diff is: " + diff);
            System.out.println("day is: " + day);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}

package com.lastisee.java.array;

import com.lastisee.java.array.Array;
public class ArrayTest {
    public static void main(String[] args) {
        Array<StudentEntity> arr = new Array<>(20);
        StudentEntity student = new StudentEntity();
        student.setStudentName("xiaoming");
        student.setSex("male");
        student.setAge(18);
        student.setSocre(87);
        arr.addElementAtLast(student);

        StudentEntity student1 = new StudentEntity();
        student1.setStudentName("xiaohua");
        student1.setSex("male");
        student1.setAge(22);
        student1.setSocre(93);
        arr.addElementAtLast(student1);

        StudentEntity student2 = new StudentEntity();
        student2.setStudentName("xiaoli");
        student2.setSex("female");
        student2.setAge(21);
        student2.setSocre(95);
        arr.addElementAtLast(student2);
        System.out.println(arr);


    }

}

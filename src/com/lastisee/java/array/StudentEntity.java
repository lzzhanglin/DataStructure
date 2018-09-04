package com.lastisee.java.array;

public class StudentEntity {

    private String studentName;

    private String sex;

    private int age;

    private int score;

    public StudentEntity(String studentName, String sex, int age, int score) {
        this.studentName = studentName;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public StudentEntity() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSocre() {
        return score;
    }

    public void setSocre(int score) {
        this.score = score;
    }


    @Override
    public String  toString() {
        return String.format("Student(studentName: %s, sex: %s, age: %d, score: %d)",studentName,sex,age,score);

    }
}

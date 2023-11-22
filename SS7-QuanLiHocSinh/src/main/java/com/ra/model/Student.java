package com.ra.model;

public class Student {
    private String studentCode;
    private String studentName;
    private String address;
    private int age;
    private String classRoom;
    private boolean sex;

    public Student() {
    }

    public Student(String studentCode, String studentName, String address, int age, String classRoom, boolean sex) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.address = address;
        this.age = age;
        this.classRoom = classRoom;
        this.sex = sex;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return classRoom;
    }

    public void setClassroom(String classroom) {
        this.classRoom = classroom;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}

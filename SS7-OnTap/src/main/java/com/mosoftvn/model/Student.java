package com.mosoftvn.model;

public class Student {
    private String studentCode;
    private String name;
    private String address;
    private int age;
    private String classroom;
    private boolean sex;

    public Student() {
    }

    public Student(String studentCode, String name, String address, int age, String classroom, boolean sex) {
        this.studentCode = studentCode;
        this.name = name;
        this.address = address;
        this.age = age;
        this.classroom = classroom;
        this.sex = sex;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}

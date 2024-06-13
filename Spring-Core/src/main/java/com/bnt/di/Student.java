package com.bnt.di;

public class Student {

    private int id;
    private String studentName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Student(int id){
        this.id = id;
    }

    public void displayStudentInfo(){
        System.out.println("Student name is : " + studentName + " and id is " + id);
    }
}

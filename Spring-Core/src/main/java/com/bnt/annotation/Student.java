package com.bnt.annotation;

public class Student {

    private String name;
    private String intrestedCourse;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntrestedCourse() {
        return intrestedCourse;
    }

    public void setIntrestedCourse(String intrestedCourse) {
        this.intrestedCourse = intrestedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo(){
        System.out.println("Student name : "+ name);
        System.out.println("Intrested course : " + intrestedCourse);
        System.out.println("Hobby : "+ hobby);
    }
}

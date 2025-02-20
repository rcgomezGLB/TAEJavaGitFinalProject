package com.model;

public class Student extends Person {
    private int studentId;

    public Student(String name) {
        super(name);
        this.studentId = 0;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("Student(Name: %s, ID: %s)", this.getName(), studentId);
    }
}

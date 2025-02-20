package com.base;

public class Student extends Person {
    private final int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return String.format("Student(Name: %s, ID: %s)", this.getName(), studentId);
    }
}

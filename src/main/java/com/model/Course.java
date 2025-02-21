package com.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final Teacher teacher;
    private final String name;
    private final List<Student> studentList;
    private int courseId;

    public Course(Teacher teacher, String name) {
        if (teacher.getTeacherId() == 0) {
            System.out.println("Teacher " + teacher.getTeacherId() + "is not referenced to the university.\nSetting teacher to null.");
            this.teacher = null;
        } else {
            this.teacher = teacher;
        }
        this.name = name;
        this.courseId = 0;
        this.studentList = new ArrayList<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void addStudent(Student student) {
        if (student.getStudentId() == 0 || studentList.contains(student)) {
            System.out.println("Model: Error adding student to course");
            return;
        }
        studentList.add(student);
    }

    @Override
    public String toString() {
        return String.format("Course (Name: %s, ID: %d)",this.getName(),this.getCourseId());
    }
}

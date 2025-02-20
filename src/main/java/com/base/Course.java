package com.base;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final Teacher teacher;
    private final String name;
    private final List<Student> studentList;
    private final int courseId;

    public Course(Teacher teacher, String name, int courseId) {
        this.teacher = teacher;
        this.name = name;
        this.courseId = courseId;
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

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Course \"%s\" with ID %d \n",this.getName(),this.getCourseId()));
        stringBuilder.append(String.format("Teacher: %s \n",this.getTeacher().getName()));
        stringBuilder.append("Student list");
        for (Student student: studentList) {
            stringBuilder.append(String.format("%s \n",student.toString()));
        }
        return stringBuilder.toString();
    }
}

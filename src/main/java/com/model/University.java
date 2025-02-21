package com.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final String name;
    private final List<Student> studentList;
    private final List<Teacher> teacherList;
    private final List<Course> courseList;

    public University(String name) {
        this.name = name;
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();
        teacherList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addStudentToUniversity(Student student) {
        if (student.getStudentId() != 0) {
            return;
        }
        studentList.add(student);
        student.setStudentId(studentList.size());
    }

    public void addCourseToUniversity(Course course) {
        if (course.getCourseId() != 0) {
            return;
        }
        courseList.add(course);
        course.setCourseId(courseList.size());

    }

    public void addTeacherToUniversity(Teacher teacher) {
        if (teacher.getTeacherId() != 0) {
            return;
        }
        teacherList.add(teacher);
        teacher.setTeacherId(teacherList.size());
    }
}


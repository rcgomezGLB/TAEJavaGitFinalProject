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

    void addStudentToUniversity(Student student) {
        if (student.getStudentId() == 0) {
            System.out.println("Error: Student " + student.toString() + " already added to a university.");
            return;
        }
        student.setStudentId(studentList.size());
        studentList.add(student);
        System.out.println("Added Student " + student.toString() + " to" + this.getName());
    }

    void addCourseToUniversity(Course course) {
        if (course.getCourseId() == 0) {
            System.out.println("Error: Course " + course.toString() + " already added to a university.");
            return;
        }
        course.setCourseId(courseList.size());
        courseList.add(course);
        System.out.println("Added Course " + course.toString() + " to" + this.getName());

    }

    void addTeacherToUniversity(Teacher teacher) {
        if (teacher.getTeacherId() == 0) {
            System.out.println("Error: Teacher " + teacher.toString() + " already added to a university.");
            return;
        }
        teacher.setTeacherId(teacherList.size());
        teacherList.add(teacher);
        System.out.println("Added Teacher " + teacher.toString() + " to" + this.getName());
    }
}


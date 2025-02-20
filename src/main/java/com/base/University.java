package com.base;

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
}


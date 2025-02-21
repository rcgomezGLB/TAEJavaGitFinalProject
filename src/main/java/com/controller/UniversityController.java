package com.controller;

import com.model.Course;
import com.model.Student;
import com.model.Teacher;
import com.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityController {
    private final University university;

    public UniversityController(String universityName) {
        university = new University(universityName);
    }

    public University getUniversity() {
        return university;
    }

}

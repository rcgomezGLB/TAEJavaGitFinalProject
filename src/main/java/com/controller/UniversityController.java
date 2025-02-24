package com.controller;

import com.model.University;

public class UniversityController {
    private final University university;

    public UniversityController(String universityName) {
        university = new University(universityName);
    }

    public University getUniversity() {
        return university;
    }

}

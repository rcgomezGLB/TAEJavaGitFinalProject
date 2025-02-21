package com.controller;

import com.model.FullTimeTeacher;
import com.model.PartTimeTeacher;
import com.model.Teacher;

import java.util.List;

public class TeacherController {
    private final UniversityController universityController;

    public TeacherController(UniversityController universityController) {
        this.universityController = universityController;
    }

    public int addFullTimeTeacherToUniversity(String name, double baseSalary, int yearsOfExperience) {
        Teacher teacher = new FullTimeTeacher(name, baseSalary, yearsOfExperience);
        this.universityController.getUniversity().addTeacherToUniversity(teacher);
        return teacher.getTeacherId();
    }

    public int addPartTimeTeacherToUniversity(String name, double baseSalary, int yearsOfExperience, int workingHours) {
        Teacher teacher = new PartTimeTeacher(name, baseSalary, yearsOfExperience, workingHours);
        this.universityController.getUniversity().addTeacherToUniversity(teacher);
        return teacher.getTeacherId();
    }


    public Teacher findTeacherById(int id) {
        for (Teacher teacher : universityController.getUniversity().getTeacherList()) {
            if (teacher.getTeacherId() == id) {
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> retrieveAllTeachers() {
        return universityController.getUniversity().getTeacherList();
    }
}

package com.controller;

import com.model.Course;
import com.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private final UniversityController universityController;

    public StudentController(UniversityController universityController) {
        this.universityController = universityController;
    }

    public void addStudentToUniversity(String name, Course course) {
        Student student = new Student(name);
        this.universityController.getUniversity().addStudentToUniversity(student);
        course.addStudent(student);
    }

    public List<Course> getStudentClasses(Student student) {
        List<Course> studentCourses = new ArrayList<>();
        outer: for (Course course: universityController.getUniversity().getCourseList()) { // Linear search
            for (Student temporalStudent: course.getStudentList()) {
                if (temporalStudent == student) {
                    studentCourses.add(course);
                    continue outer;
                }
            }
        }
        return studentCourses;
    }

    public List<Student> retrieveAllStudents() {
        return universityController.getUniversity().getStudentList();
    }
}

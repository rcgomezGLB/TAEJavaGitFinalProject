package com.controller;

import com.model.Course;
import com.model.Student;
import com.model.Teacher;
import com.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityController {
    private final University university;

    public UniversityController(University university) {
        this.university = university;
    }

    public void addStudentAndAddToClass(Student student, Course course) {
        university.addStudentToUniversity(student);
        course.addStudent(student);
    }

    public void addTeacherToUniversity(Teacher teacher) {
        university.addTeacherToUniversity(teacher);
    }

    public void addNewCourseToUniversity(Course course, List<Student> studentList) {
        university.addCourseToUniversity(course);
        for (Student student: studentList) {
            course.addStudent(student);
        }
    }
    public List<Course> getStudentClasses(Student student) {
        List<Course> studentCourses = new ArrayList<>();
        outer: for (Course course: university.getCourseList()) { // Linear search
            for (Student temporalStudent: course.getStudentList()) {
                if (temporalStudent == student) {
                    studentCourses.add(course);
                    continue outer;
                }
            }
        }
        return studentCourses;
    }
}

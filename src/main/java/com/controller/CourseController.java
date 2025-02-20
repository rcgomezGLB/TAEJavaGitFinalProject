package com.controller;

import com.model.Course;
import com.model.Student;
import com.model.Teacher;

import java.util.List;

public class CourseController {
    private final UniversityController universityController;

    public CourseController(UniversityController universityController) {
        this.universityController = universityController;
    }

    public void addNewCourseToUniversity(String name, int teacherId, List<Student> studentList) {
        Teacher teacher = findTeacherById(teacherId);
        Course newCourse = new Course(teacher, name);
        for (Student student: studentList) {
            newCourse.addStudent(student);
        }

    }

    public Teacher findTeacherById(int id) {
        Teacher teacher;
        for (Teacher _teacher: universityController.getUniversity().getTeacherList()) {
            if (_teacher.getTeacherId() == id) {
                return _teacher;
            }
        }
        return null;
    }
}

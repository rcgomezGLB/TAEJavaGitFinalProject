package com.controller;

import com.model.Course;
import com.model.Student;
import com.model.Teacher;

import java.util.List;

public class CourseController {
    private final UniversityController universityController;
    private final TeacherController teacherController;

    public CourseController(UniversityController universityController, TeacherController teacherController) {
        this.universityController = universityController;
        this.teacherController = teacherController;
    }

    public int addNewCourseToUniversity(String name, int teacherId, List<Student> studentList) {
        Teacher teacher = teacherController.findTeacherById(teacherId);
        Course newCourse = new Course(teacher, name);
        universityController.getUniversity().addCourseToUniversity(newCourse);
        for (Student student : studentList) {
            newCourse.addStudent(student);
        }
        return newCourse.getCourseId();
    }

    public List<Course> retrieveAllCourses() {
        return universityController.getUniversity().getCourseList();
    }

    public Course retrieveCourseById(int id) {
        for (Course course : universityController.getUniversity().getCourseList()) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

}

package com.controller;

import com.model.Student;
import com.view.MenuView;

import java.util.ArrayList;
import java.util.List;

public class MenuController {
    private CourseController courseController;
    private StudentController studentController;
    private TeacherController teacherController;
    private MenuView menuView;

    public MenuController(CourseController courseController, StudentController studentController, TeacherController teacherController, MenuView menuView) {
        this.courseController = courseController;
        this.studentController = studentController;
        this.teacherController = teacherController;
        this.menuView = menuView;
    }

    public void startMenu() {
        boolean running = true;

        while (running) {
            menuView.displayMenu();
            char choice = menuView.getOption();

            switch (choice) {
                case 'a':
                    menuView.printList(teacherController.retrieveAllTeachers());
                    break;
                case 'b':
                    menuView.printList(courseController.retrieveAllCourses());
                    break;
                case 'c':
                    menuView.showMessage("Adding new student");
                    String studentName = menuView.getStudentName();
                    menuView.showMessage("Adding student " + studentName + " to a course");
                    menuView.printList(courseController.retrieveAllCourses());
                    menuView.showMessage("Select course ID to add student " + studentName);
                    int newStudentCourseId = menuView.getId("course");
                    studentController.addStudentToUniversity(studentName, newStudentCourseId);
                    menuView.showMessage("Created student with name " + studentName + "and added to course with ID " + newStudentCourseId);
                    break;
                case 'd':
                    menuView.showMessage("Adding new class");
                    String courseName = menuView.getCourseName();
                    menuView.showMessage("Select teacher ID to dictate the course");
                    menuView.printList(teacherController.retrieveAllTeachers());
                    int teacherId = menuView.getId("teacher");
                    menuView.showMessage("How many students to include? ");
                    int studentsNumber = menuView.getNumber();
                    List<Student> studentList = new ArrayList<>();
                    for (int i = 0; i < studentsNumber; i++) {
                        menuView.showMessage("Adding student #" + ( i + 1 ) );
                        menuView.printList(studentController.retrieveAllStudents());
                        int studentId = menuView.getId("student");
                        studentList.add(studentController.retrieveStudentById(studentId));
                    }
                    courseController.addNewCourseToUniversity(courseName, teacherId, studentList);
                    menuView.showMessage("Added course" + courseName);
                    break;

                case 'g':
                    menuView.showMessage("Bye!");
                    running = false;
                    break;
                default:
                    menuView.showMessage("Invalid Option");
            }

        }
    }
}

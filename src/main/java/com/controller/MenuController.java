package com.controller;

import com.model.Student;
import com.view.MenuView;

import java.util.ArrayList;
import java.util.List;

public class MenuController {
    private final CourseController courseController;
    private final StudentController studentController;
    private final TeacherController teacherController;
    private final MenuView menuView;

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
                    optionA();
                    break;
                case 'b':
                    optionB();
                    break;
                case 'c':
                    optionC();
                    break;
                case 'd':
                    optionD();
                    break;
                case 'e':
                    optionE();
                    break;
                case 'f':
                    optionF();
                    break;
                case 'g':
                    optionG();
                    running = false;
                    break;
                default:
                    defaultOption();
            }

        }
    }

    private void optionA() {
        menuView.printList(teacherController.retrieveAllTeachers());
    }

    private void optionB() {
        menuView.printList(courseController.retrieveAllCourses());
    }

    private void optionC() {
        menuView.showMessage("Adding new student");
        String studentName = menuView.getStudentName();
        menuView.showMessage("Adding student " + studentName + " to a course");
        menuView.printList(courseController.retrieveAllCourses());
        menuView.showMessage("Select course ID to add student " + studentName);
        int newStudentCourseId = menuView.getId("course");
        studentController.addStudentToUniversity(studentName, newStudentCourseId);
        menuView.showMessage("Created student with name " + studentName + "and added to course with ID " + newStudentCourseId);
    }

    private void optionD() {
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
    }

    private void optionE() {
        int id = menuView.getId("student");
        Student student = studentController.retrieveStudentById(id);
        menuView.showMessage("Showing all classes of student " + student.getName());
        menuView.printList(studentController.getStudentClasses(student));
    }

    private void optionF() {
        menuView.printList(studentController.retrieveAllStudents());
    }

    private void optionG() {
        menuView.showMessage("Bye!");
    }

    private void defaultOption() {
        menuView.showMessage("Invalid option");
    }
}

package com.controller;

import com.view.MenuView;

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
                case 'd':
                    menuView.showMessage("Bye!");
                    running = false;
                default:
                    menuView.showMessage("Invalid Option");
            }

        }
    }
}

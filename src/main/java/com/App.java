package com;

import com.controller.*;
import com.view.MenuView;

public class App {
    public static void main(String[] args) {
        UniversityController universityController = new UniversityController("Globant");
        TeacherController teacherController = new TeacherController(universityController);
        CourseController courseController = new CourseController(universityController,teacherController);
        StudentController studentController = new StudentController(universityController, courseController);

        MenuView menuView = new MenuView();
        MenuController menuController = new MenuController(courseController, studentController, teacherController, menuView);

        menuController.startMenu();
    }
}

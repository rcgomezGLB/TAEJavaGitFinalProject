package com.utils;

import com.controller.CourseController;
import com.controller.StudentController;
import com.controller.TeacherController;
import com.controller.UniversityController;

import java.util.ArrayList;

public class AppUtils {
    public static void initializeUniversity(UniversityController universityController, StudentController studentController, TeacherController teacherController, CourseController courseController) {

        // Initialize Teachers
        int andersonId = teacherController.addFullTimeTeacherToUniversity("Anderson", 6000000,10);
        int javierId = teacherController.addFullTimeTeacherToUniversity("Javier", 4000000, 2);
        int pedroId = teacherController.addPartTimeTeacherToUniversity("Pedro", 100000,9,20);

        // Initialize Courses
        int javaGitId = courseController.addNewCourseToUniversity("Java & Git", andersonId, new ArrayList<>());
        int taeBasicsId = courseController.addNewCourseToUniversity("Test Automation Basics", andersonId, new ArrayList<>());
        int scrumId = courseController.addNewCourseToUniversity("Scrum Methodology", javierId, new ArrayList<>());
        int mobileId = courseController.addNewCourseToUniversity("Mobile Testing", pedroId, new ArrayList<>());

        // Initialize Students
        int robertoId = studentController.addStudentToUniversity("Roberto",javaGitId);
        int andresId = studentController.addStudentToUniversity("Andres", javaGitId);
        int davidId = studentController.addStudentToUniversity("David", javaGitId);
        int juanId = studentController.addStudentToUniversity("Juan", javaGitId);
        int pabloId = studentController.addStudentToUniversity("Pablo", javaGitId);
        studentController.addStudentToUniversity("Esteban", javaGitId);

        // Additional Courses to Students
        studentController.addStudentToCourse(robertoId, taeBasicsId);
        studentController.addStudentToCourse(robertoId, scrumId);
        studentController.addStudentToCourse(robertoId, mobileId);
        studentController.addStudentToCourse(andresId, mobileId);
        studentController.addStudentToCourse(davidId, scrumId);
        studentController.addStudentToCourse(juanId, taeBasicsId);
        studentController.addStudentToCourse(pabloId, mobileId);

    }
}

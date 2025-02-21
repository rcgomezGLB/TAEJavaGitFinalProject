package com.view;

import com.utils.MenuViewUtils;

import java.util.List;
import java.util.Scanner;

public class MenuView {
    private final Scanner scanner;

    public MenuView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\nUniversity Management System");
        System.out.println("a) Print all professors with its data");
        System.out.println("b) Print all classes");
        System.out.println("c) Create new student and add to existing class");
        System.out.println("d) Create new class and add an existing teacher and existing student");
        System.out.println("e) List all classes of student ID");
        System.out.println("f) List all students");
        System.out.println("g) Exit");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int getId(String idOf) {
        System.out.print("Insert " + idOf +" ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public int getNumber() {
        System.out.print("Insert number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public char getOption() {
        System.out.print("Insert Option: ");
        String input = scanner.nextLine();
        if (input.length() != 1) {
            showMessage("Error: Invalid option format");
            return '\0';
        }
        return input.charAt(0);
    }

    public String getStudentName() {
        System.out.print("Enter student name: ");
        return scanner.nextLine();
    }

    public String getCourseName() {
        System.out.print("Enter course name: ");
        return scanner.nextLine();
    }

    public <T> void printList(List<T> list) {
        if (list.isEmpty()) {
            showMessage("Empty List");
            return;
        }

        showMessage("--- " + MenuViewUtils.getItemType(list.get(0)) + "s" + " ---");

        for (T listItem: list) {
            showMessage(listItem.toString());
        }
    }

}

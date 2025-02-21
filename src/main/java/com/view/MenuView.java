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
        System.out.println("d) Exit");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int getId() {
        scanner.next();
        System.out.print("Insert ID: ");
        return scanner.nextInt();
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

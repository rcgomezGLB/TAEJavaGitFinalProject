package com.model;

public class PartTimeTeacher extends Teacher {
    private final int workingHours;

    public PartTimeTeacher(String name, double baseSalary, int yearsOfExperience, int workingHours) {
        super(name, baseSalary, yearsOfExperience);
        this.workingHours = workingHours;
    }

    @Override
    void setSalary() {
        this.setSalary(getBaseSalary() * workingHours);
    }
}

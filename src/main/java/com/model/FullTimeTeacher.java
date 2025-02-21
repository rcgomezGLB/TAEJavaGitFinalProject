package com.model;

public class FullTimeTeacher extends Teacher {
    public FullTimeTeacher(String name, double baseSalary, int yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }

    @Override
    void setSalary() {
        this.setSalary(this.getBaseSalary() * (1 + 0.1 * this.getYearsOfExperience()));
    }
}

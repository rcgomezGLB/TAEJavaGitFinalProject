package com.base;

public abstract class Teacher extends Person {
    private final double baseSalary;
    private double salary;
    private final int yearsOfExperience;
    private int teacherId;

    public Teacher(String name, double baseSalary, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
        this.baseSalary = baseSalary;
        this.teacherId = 0;
        setSalary();
    }

    abstract void setSalary();

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return String.format("Teacher(Name: %s, ID: %s)", this.getName(), this.getTeacherId());
    }
}

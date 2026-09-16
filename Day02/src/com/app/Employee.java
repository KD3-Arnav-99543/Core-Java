package com.app;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {

        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }
}
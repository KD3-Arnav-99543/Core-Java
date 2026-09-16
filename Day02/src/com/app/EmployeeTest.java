package com.app;

public class EmployeeTest {

    public static void main(String[] args) {

        // Create two Employee objects
        Employee employee1 = new Employee("Arnav", "Kumar", 30000);
        Employee employee2 = new Employee("Rahul", "Sharma", 40000);

        // Display employee 1 yearly salary
        System.out.println("Employee 1: "
                + employee1.getFirstName() + " "
                + employee1.getLastName());

        System.out.println("Yearly Salary: "
                + employee1.getMonthlySalary() * 12);

        System.out.println();

        // Display employee 2 yearly salary
        System.out.println("Employee 2: "
                + employee2.getFirstName() + " "
                + employee2.getLastName());

        System.out.println("Yearly Salary: "
                + employee2.getMonthlySalary() * 12);

        // Give 10% raise
        employee1.setMonthlySalary(
                employee1.getMonthlySalary() * 1.10
        );

        employee2.setMonthlySalary(
                employee2.getMonthlySalary() * 1.10
        );

        // Display yearly salary after 10% raise
        System.out.println("\nAfter 10% Raise:");

        System.out.println("Employee 1 Yearly Salary: "
                + employee1.getMonthlySalary() * 12);

        System.out.println("Employee 2 Yearly Salary: "
                + employee2.getMonthlySalary() * 12);
    }
}
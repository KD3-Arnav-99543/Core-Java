package com.app;

public class Date {

    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {

        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter and Setter for month
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // Getter and Setter for day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display Date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
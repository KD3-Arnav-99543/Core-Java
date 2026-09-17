package com.app.geometry;

public class Point2D {

    private double x;
    private double y;

    // Parameterized constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Return point details
    public String getDetails() {
        return "Point(" + x + ", " + y + ")";
    }

    // Check whether two points are equal
    public boolean isEqual(Point2D p) {
        return this.x == p.x && this.y == p.y;
    }

    // Calculate distance between current point and specified point
    public double calculateDistance(Point2D p) {

        double dx = p.x - this.x;
        double dy = p.y - this.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
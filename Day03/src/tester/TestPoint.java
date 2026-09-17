package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First point
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Create objects
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display details
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // Check equality
        if (p1.isEqual(p2)) {
            System.out.println("Points are same.");
        } else {
            System.out.println("Points are different.");
        }

        // Calculate distance
        double distance = p1.calculateDistance(p2);

        System.out.println("Distance between points: " + distance);

        sc.close();
    }
}
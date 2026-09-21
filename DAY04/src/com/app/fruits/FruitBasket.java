package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the basket capacity: ");
        int capacity = sc.nextInt();
        
        Fruit[] basket = new Fruit[capacity];
        int counter = 0;
        int choice;

        do {
            System.out.println("\n--- Fruit Basket Menu ---");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of all fresh fruits");
            System.out.println("6. Display tastes of all stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits stale");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting... Happy snacking!");
                    break;

                case 1: // Add Mango
                    if (counter < capacity) {
                        System.out.print("Enter Mango name, color, weight: ");
                        basket[counter++] = new Mango(sc.next(), sc.next(), sc.nextDouble());
                        System.out.println("Mango added successfully!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2: // Add Orange
                    if (counter < capacity) {
                        System.out.print("Enter Orange name, color, weight: ");
                        basket[counter++] = new Orange(sc.next(), sc.next(), sc.nextDouble());
                        System.out.println("Orange added successfully!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3: // Add Apple
                    if (counter < capacity) {
                        System.out.print("Enter Apple name, color, weight: ");
                        basket[counter++] = new Apple(sc.next(), sc.next(), sc.nextDouble());
                        System.out.println("Apple added successfully!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4: // Display names of all fruits
                    System.out.println("\nFruits in the basket:");
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println("- " + f.getName());
                        }
                    }
                    break;

                case 5: // Display details of fresh fruits
                    System.out.println("\nFresh Fruits details:");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f + ", Taste: " + f.taste());
                        }
                    }
                    break;

                case 6: // Display tastes of stale fruits
                    System.out.println("\nTastes of stale fruits:");
                    boolean dynamicStaleFlag = false;
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " tastes " + f.taste());
                            dynamicStaleFlag = true;
                        }
                    }
                    if (!dynamicStaleFlag) System.out.println("No stale fruits found.");
                    break;

                case 7: // Mark a specific fruit as stale
                    System.out.print("Enter basket index to mark stale (0 to " + (counter - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println(basket[index].getName() + " marked as stale.");
                    } else {
                        System.out.println("Error: Invalid index!");
                    }
                    break;

                case 8: // Mark all sour fruits stale
                    System.out.println("Marking all sour fruits as stale...");
                    for (Fruit f : basket) {
                        if (f != null && f.taste().equalsIgnoreCase("sour")) {
                            f.setFresh(false);
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid Option! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}

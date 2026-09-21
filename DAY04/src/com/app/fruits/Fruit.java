package com.app.fruits;

public abstract class Fruit {
    private String name;
    private String color;
    private double weight;
    private boolean isFresh; // 1. Ensure this variable exists

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true; 
    }

    public abstract String taste();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    // 2. Ensure this getter matches FruitBasket calls exactly
    public boolean isFresh() {
        return isFresh;
    }

    // 3. Ensure this setter matches FruitBasket calls exactly
    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight + "kg, Fresh: " + isFresh;
    }
}

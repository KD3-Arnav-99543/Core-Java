package com.app.fruits;

public class Mango extends Fruit {
    // Parameter types and order must perfectly match the Fruit constructor
    public Mango(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}

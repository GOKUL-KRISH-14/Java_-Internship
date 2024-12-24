package com.javainternship;

class Cycle {
    String brand;
    int speed;

    // Parameterized constructor
    Cycle(String brand, int speed) {
        this.brand = brand;  // "this" refers to the current object's attributes
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Cycle cycle1 = new Cycle("Atlas", 120);
        Cycle cycle2 = new Cycle("Hercules", 150);

        cycle1.display();
        cycle2.display();
    }
}

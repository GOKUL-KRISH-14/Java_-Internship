package com.javainternship;

class Bike
{
    String brand;
    int speed;

    // Default constructor
    Bike() {
        brand = "Unknown";
        speed = 0;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bike bike = new Bike(); // Calls the default constructor
        bike.display();
    }
}


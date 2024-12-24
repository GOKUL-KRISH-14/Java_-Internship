package com.javainternship;

class Car 
{
    // Instance variables
    String brand;
    String color;
    int speed;

    // Constructor
    public Car(String brand, String color, int speed) 
    {
        this.brand = brand;  // Assigning values to instance variables
        this.color = color;
        this.speed = speed;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class InstanceVariable
{
    public static void main(String[] args) 
    {
        // Creating objects of Car class
        Car car1 = new Car("Ferrari", "BLUE", 120);
        Car car2 = new Car("Alto", "GREEN", 150);

        // Accessing and displaying instance variables
        car1.displayDetails();
        System.out.println();
        car2.displayDetails();
    }
}

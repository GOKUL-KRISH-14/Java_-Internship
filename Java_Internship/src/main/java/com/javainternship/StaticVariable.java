package com.javainternship;

public class StaticVariable
{
    // Static variable
    static int counter = 0;

    // Instance variable
    int instanceValue;

    // Constructor
    public StaticVariable() 
    {
        counter++; // Increment static variable for every object created
        instanceValue = counter; // Assign current value to instance variable
    }

    public static void main(String[] args) 
    {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        System.out.println("Static counter: " + StaticVariable.counter);
        System.out.println("Instance value of obj1: " + obj1.instanceValue);
        System.out.println("Instance value of obj2: " + obj2.instanceValue);
        System.out.println("Instance value of obj3: " + obj3.instanceValue);
    }
}


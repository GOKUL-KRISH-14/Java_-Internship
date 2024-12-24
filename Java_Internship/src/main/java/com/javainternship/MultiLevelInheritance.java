package com.javainternship;

class Animal2 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal 
{
    void walk() {
        System.out.println("This mammal walks.");
    }
}

class Dog2 extends Mammal 
{
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args) 
    {
        Dog2 dog = new Dog2();
        dog.eat();  // Inherited from Animal class
        dog.walk(); // Inherited from Mammal class
        dog.bark(); // Defined in Dog class
    }
}

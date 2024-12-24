package com.javainternship;



class Animal3 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog3 extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance  {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}

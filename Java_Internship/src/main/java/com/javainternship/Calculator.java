package com.javainternship;

public class Calculator 
{
    // Add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));
    }
}

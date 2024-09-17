package com.example.labday2;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Hello World!!");
        int number1 = 10;
        int number2 = 5;
        add(number1, number2);
        subtract(number1, number2);
        multiply(number1, number2);
        divide(number1, number2);
    } 

    public static int add(int a, int b) {
        int add = 0;

        add = a + b;
        System.out.println("The result of adding  " + a + " + " + b + " = " + add);
        return add;
    }

    public static int subtract(int a, int b) {
        int subtract = 0;

        subtract = a - b;
        System.out.println("The result of subtracting  " + a + " - " + b + " = " + subtract);
        return subtract;
    }

    public static int multiply(int a, int b) {
        int multiply = 0;

        multiply = a * b;
        System.out.println("The result of multiplying  " + a + " * " + b + " = " + multiply);
        return multiply;
    }

    public static int divide(int a, int b) {
        int divide = 0;

        divide = a / b;
        System.out.println("The result of dividing  " + a + " / " + b + " = " + divide);
        return divide;
    }
}
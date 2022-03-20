package com.learningJava;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        int c;
        try {
            c = calculator.divide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
            return;
        }
        calculator.println.accept(c);
    }
}

package com.learningJava;

import java.util.function.*;

public class Calculator {
    private Calculator() {
    }

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;
    /*
    Ошибка возникает при делении на ноль.
    Решение проблемы:
    BinaryOperator<Integer> divide = (x, y) -> Integer.divideUnsigned(x,y);
    };
     */
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> Math.abs(x);

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}

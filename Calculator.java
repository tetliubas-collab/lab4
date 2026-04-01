package com.calculator;

/**
 * Основний клас калькулятора з базовими арифметичними операціями.
 * Цей клас покривається юніт-тестами в CI/CD пайплайні.
 */
public class Calculator {

    /**
     * Додавання двох чисел
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Віднімання двох чисел
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Множення двох чисел
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Ділення двох чисел
     * @throws ArithmeticException якщо divisor = 0
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Квадратний корінь
     * @throws ArithmeticException якщо число від'ємне
     */
    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(a);
    }

    /**
     * Піднесення до степеня
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

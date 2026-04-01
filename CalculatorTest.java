package com.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Юніт-тести для класу Calculator.
 * Запускаються автоматично в GitHub Actions при кожному push/PR.
 */
@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ===== Тести додавання =====

    @Test
    @DisplayName("Add: 2 + 3 = 5")
    void testAddPositiveNumbers() {
        assertEquals(8.0, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Add: -1 + (-2) = -3")
    void testAddNegativeNumbers() {
        assertEquals(-3.0, calculator.add(-1, -2));
    }

    @Test
    @DisplayName("Add: 0 + 0 = 0")
    void testAddZeros() {
        assertEquals(0.0, calculator.add(0, 0));
    }

    // ===== Тести віднімання =====

    @Test
    @DisplayName("Subtract: 10 - 4 = 6")
    void testSubtract() {
        assertEquals(6.0, calculator.subtract(10, 4));
    }

    @Test
    @DisplayName("Subtract: 0 - 5 = -5")
    void testSubtractFromZero() {
        assertEquals(-5.0, calculator.subtract(0, 5));
    }

    // ===== Тести множення =====

    @Test
    @DisplayName("Multiply: 3 * 4 = 12")
    void testMultiply() {
        assertEquals(12.0, calculator.multiply(3, 4));
    }

    @Test
    @DisplayName("Multiply: any * 0 = 0")
    void testMultiplyByZero() {
        assertEquals(0.0, calculator.multiply(999, 0));
    }

    // ===== Тести ділення =====

    @Test
    @DisplayName("Divide: 10 / 2 = 5")
    void testDivide() {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    @Test
    @DisplayName("Divide: throws ArithmeticException on divide by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    // ===== Тести квадратного кореня =====

    @Test
    @DisplayName("Sqrt: sqrt(9) = 3")
    void testSqrt() {
        assertEquals(3.0, calculator.sqrt(9));
    }

    @Test
    @DisplayName("Sqrt: throws exception for negative number")
    void testSqrtNegative() {
        assertThrows(ArithmeticException.class, () -> calculator.sqrt(-4));
    }

    // ===== Тести степеня =====

    @Test
    @DisplayName("Power: 2^10 = 1024")
    void testPower() {
        assertEquals(1024.0, calculator.power(2, 10));
    }

    @Test
    @DisplayName("Power: any^0 = 1")
    void testPowerZeroExponent() {
        assertEquals(1.0, calculator.power(999, 0));
    }
}

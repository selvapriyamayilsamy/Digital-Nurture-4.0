package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Setup - runs BEFORE each test
        System.out.println("Setting up calculator...");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        // Cleanup - runs AFTER each test
        System.out.println("Cleaning up...");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5, b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10, b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}

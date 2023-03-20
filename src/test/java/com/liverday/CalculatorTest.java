package com.liverday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void shouldBeAbleToAddTwoNumbers() {
        // arrange
        double x = 2;
        double y = 3;
        double expectedResult = 5;
        // act
        double result = Calculator.add(x, y);
        // assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToSubtractTwoNumbers() {
        // arrange
        double x = 5;
        double y = 3;
        double expectedResult = 2;
        // act
        double result = Calculator.subtract(x, y);
        // assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToMultiplyTwoNumbers() {
        // arrange
        double x = 5;
        double y = 3;
        double expectedResult = 15;
        // act
        double result = Calculator.multiply(x, y);
        // assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToDivideTwoNumbers() {
        // arrange
        double x = 6;
        double y = 3;
        double expectedResult = 2;
        // act
        double result = Calculator.divide(x, y);
        // assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldBeAbleToDivideANumberByZeroAndNotThrowsAnException() {
        // arrange
        double x = 6;
        double y = 0;
        double expectedResult = 0;
        // act
        double result = Assertions.assertDoesNotThrow(() -> Calculator.divide(x, y));
        // assert
        Assertions.assertEquals(expectedResult, result);
    }
}

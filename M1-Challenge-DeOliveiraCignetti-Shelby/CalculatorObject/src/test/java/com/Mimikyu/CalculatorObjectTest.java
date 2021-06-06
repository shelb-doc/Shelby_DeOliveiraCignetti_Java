package com.Mimikyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorObjectTest {

    private CalculatorObject calc = new CalculatorObject();

    @Test
    public void shouldReturnSumOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer addition.";

        assertEquals(failMessage, 5, calc.add(2, 3));
        assertEquals(failMessage, 17, calc.add(20, -3));
        assertEquals(failMessage, 1, calc.add(0, 1));
    }

    @Test
    public void shouldReturnDifferenceOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer subtraction.";

        assertEquals(failMessage, -1, calc.subtract(2, 3));
        assertEquals(failMessage,  23, calc.subtract(20, -3));
        assertEquals(failMessage, 10, calc.subtract(11, 1));
    }

    @Test
    public void shouldReturnProductOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer multiplication.";

        assertEquals(failMessage, 6, calc.multiply(2, 3));
        assertEquals(failMessage, -60, calc.multiply(20, -3));
        assertEquals(failMessage, 0, calc.multiply(0, 1));
    }

    @Test
    public void shouldReturnQuotientOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer division.";

        assertEquals(failMessage, 1, calc.divide(4, 3));
        assertEquals(failMessage, -5, calc.divide(20, -4));
        assertEquals(failMessage, 3, calc.divide(18, 5));
    }
    @Test
    public void shouldReturnQuotientOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double division.";
        assertEquals(failMessage, 0.7096, calc.divide(2.2d, 3.1d), .0001);
        assertEquals(failMessage, -0.6666, calc.divide(2.0d, -3d), .0001);
        assertEquals(failMessage, 7.6, calc.divide(7.6d, 1d), .0001);
    }
    @Test
    public void shouldReturnProductOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double multiplication.";
        assertEquals(failMessage, 6.82, calc.multiply(2.2d, 3.1d), .0001);
        assertEquals(failMessage, -6, calc.multiply(2.0d, -3d), .0001);
        assertEquals(failMessage, 7.6, calc.multiply(7.6d, 1d), .0001);
    }
    @Test
    public void shouldReturnDifferenceOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double subtraction.";
        assertEquals(failMessage, -0.9, calc.subtract(2.2d, 3.1d), .0001);
        assertEquals(failMessage, 5, calc.subtract(2.0d, -3d), .0001);
        assertEquals(failMessage, 6.6, calc.subtract(7.6d, 1d), .0001);
    }
    @Test
    public void shouldReturnSumOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage, 5.3, calc.add(2.2d, 3.1d), .0001);
        assertEquals(failMessage, -1, calc.add(2.0d, -3d), .0001);
        assertEquals(failMessage, 8.6, calc.add(7.6d, 1d), .0001);
    }
}
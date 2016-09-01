package com.example.dione.unittestsample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dione on 01/09/2016.
 */
public class CalculatorTest {
    private Calculator mCalculator;
    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        //expected: 6, sum of 1 and 5
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void testSubtract() throws Exception {
        //expected: 1, difference of 5 and 4
        assertEquals(1d, mCalculator.subtract(5d, 4d), 0);
    }

    @Test
    public void testDivide() throws Exception {
        //expected: 1, divide 5 and 4
        assertEquals(1d, mCalculator.divide(5d, 5d), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        //expected: 20, multiply 5 and 4
        assertEquals(20d, mCalculator.multiply(5d, 4d), 0);
    }
}
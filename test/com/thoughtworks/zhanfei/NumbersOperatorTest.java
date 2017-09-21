package com.thoughtworks.zhanfei;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumbersOperatorTest {
    NumbersOperator numbersOperator;

    @Before
    public void setUp() throws Exception {
        numbersOperator = new NumbersOperator();
    }

    @Test
    public void shouldGetOnlyPositiveNumbers() throws Exception {
        List<Integer> initialNumbers = Arrays.asList(1, -1, 0, 3, -2, 8);

        List<Integer> positiveNumbers = numbersOperator.getPositiveNumbers(initialNumbers);

        assertEquals(Arrays.asList(1, 3, 8), positiveNumbers);
    }

    @Test
    public void shouldGetOnlyEvenNumbers() throws Exception {
        List<Integer> initialNumbers = Arrays.asList(1, -1, 0, 3, -2, 8);

        List<Integer> evenNumbers = numbersOperator.getEvenNumbers(initialNumbers);

        assertEquals(Arrays.asList(0, -2, 8), evenNumbers);
    }

    @Test
    public void shouldGetPositiveEvenNumbers() throws Exception {
        List<Integer> initialNumbers = Arrays.asList(1, -1, 0, 3, -2, 8);

        List<Integer> positiveEvenNumbers = numbersOperator.getPositiveEvenNumbers(initialNumbers);

        assertEquals(Collections.singletonList(8), positiveEvenNumbers);
    }
}
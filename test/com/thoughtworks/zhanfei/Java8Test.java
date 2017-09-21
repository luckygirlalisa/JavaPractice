package com.thoughtworks.zhanfei;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Java8Test {
    Java8 java8;

    @Before
    public void setUp() throws Exception {
        java8 = new Java8();
    }

    //Collections, sort: used to sort element in a list, change the list.
    @Test
    public void lambdaExpressionAndPassingMethodWithCollectionSort() {
        List<String> names = Arrays.asList("Mahesh ", "Suresh ", "Ramesh ", "Naresh ", "Kalpesh ");

        java8.sortUsingCollectionSort(names);

        assertEquals(Arrays.asList("Kalpesh ", "Mahesh ", "Naresh ", "Ramesh ", "Suresh "), names);
    }

    //Stream, reduce: used to find one from a stream
    @Test
    public void shouldFindLargestStringInOneListWithReduce() throws Exception {
        List<String> names = Arrays.asList("Ma", "Sur", "Ramesh", "ab");

        String best = java8.findBestWithStreamReduce(names);

        assertEquals("Ramesh", best);
    }

    //Stream, map: used to create a new list with existing list
    @Test
    public void shouldModifyAllStringsInOneListWithMap() throws Exception {
        List<String> names = Arrays.asList("Ma ", "Sur ", "Ramesh ");

        List<String> awesomeNames = java8.appendAwesomeWithMap(names);

        assertEquals(Arrays.asList("AwesomeMa ", "AwesomeSur ", "AwesomeRamesh "), awesomeNames);
    }

    //Stream/Collection, forEach: used to modify or operate every element in list, no return
    @Test
    public void shouldModifyAllStringsInOneListWithForEach() throws Exception {
        List<String> names = Arrays.asList("Ma ", "Sur ", "Ramesh ");

        List<String> awesomeNames = java8.appendAwesomeWithForEach(names);

        assertEquals(Arrays.asList("AwesomeMa ", "AwesomeSur ", "AwesomeRamesh "), awesomeNames);
    }

    //Stream, filter: used to filter out some elements in one list and return a new one
    @Test
    public void shouldGetPositiveNumbersWithFilter() throws Exception {
        List<Integer> numbers = Arrays.asList(1, -1, 0, 3, -2, 9);

        List<Integer> positiveNumbers = java8.getPositiveNumbersWithFilter(numbers);

        assertEquals(Arrays.asList(1, 3, 9), positiveNumbers);
    }
}

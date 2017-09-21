package com.thoughtworks.zhanfei;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumbersOperator {
    List<Integer> getPositiveNumbers(List<Integer> initialNumbers) {
        return operate(initialNumbers, number -> number > 0);
    }

    List<Integer> getPositiveEvenNumbers(List<Integer> initialNumbers) {
//        Predicate<Integer> positive = number -> number > 0;
//        Predicate<Integer> even = number -> number % 2 == 0;
//
//        return operate(initialNumbers, positive.and(even));

        return getEvenNumbers(getPositiveNumbers(initialNumbers));
    }

    List<Integer> getEvenNumbers(List<Integer> initialNumbers) {
        return operate(initialNumbers, number -> number % 2 == 0);
    }

    private List<Integer> operate(List<Integer> initialNumbers, Predicate<Integer> even) {
        return initialNumbers.stream().filter(even).collect(Collectors.toList());
    }
}

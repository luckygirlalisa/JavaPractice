package com.thoughtworks.zhanfei;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumbersOperator {
    List<Integer> getPositiveNumbers(List<Integer> initialNumbers) {
        Predicate<Integer> positive = number -> number > 0;

        return initialNumbers.stream().filter(positive).collect(Collectors.toList());
    }

    List<Integer> getPositiveEvenNumbers(List<Integer> initialNumbers) {
        Predicate<Integer> positive = number -> number > 0;
        Predicate<Integer> even = number -> number % 2 == 0;

        return initialNumbers.stream().filter(positive.and(even)).collect(Collectors.toList());
    }


    public List<Integer> getEvenNumbers(List<Integer> initialNumbers) {
        Predicate<Integer> even = number -> number % 2 == 0;

        return initialNumbers.stream().filter(even).collect(Collectors.toList());
    }
}

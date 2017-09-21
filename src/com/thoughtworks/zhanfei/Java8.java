package com.thoughtworks.zhanfei;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        System.out.println("Hello Java 8");

    }

    String findBestWithStreamReduce(List<String> names) {
        return  names.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
    }

    List<String> appendAwesomeWithMap(List<String> names) {
        Function<String, String> makeAwesome = name -> "Awesome" + name;
        return names.stream().map(makeAwesome).collect(Collectors.toList());
    }

    void sortUsingCollectionSort(List<String> names){
//        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        Collections.sort(names, String::compareTo);
    }

    List<Integer> getPositiveNumbersWithFilter(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
    }

    List<String> appendAwesomeWithForEach(List<String> names) {
        ArrayList<String> awesomeNames = new ArrayList<>();
        names.forEach(name -> awesomeNames.add("Awesome" + name));

        return awesomeNames;
    }

    List<Integer> generateSortedNumbers(List<Integer> numbers) {
//        return numbers.stream()
//                .sorted((number1, number2) -> Objects.equals(number1, number2) ? 0 : (number1 > number2 ? 1 : -1))
//                .collect(Collectors.toList());
        return numbers.stream().sorted().collect(Collectors.toList());
    }

    public List<Integer> cutWithStreamEmpty(List<Integer> numbers) {
        return numbers.stream().limit(3).collect(Collectors.toList());
    }
}

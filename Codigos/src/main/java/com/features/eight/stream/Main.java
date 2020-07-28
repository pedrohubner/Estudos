package com.features.eight.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> integerList = List.of(List.of(1, 2, 3));

        List<Integer> collect = integerList.stream()
                .flatMap(number -> number.stream())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}

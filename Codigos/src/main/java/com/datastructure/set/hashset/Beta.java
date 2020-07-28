package com.datastructure.set.hashset;

import java.util.HashSet;

public class Beta {
    public static void main(String[] args) {

        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("Gravataí");
        stringHashSet.add("Goiás");
        stringHashSet.add("Porto Alegre");
        stringHashSet.add("Maceió");

        stringHashSet.stream()
                .filter(s -> s.startsWith("G"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

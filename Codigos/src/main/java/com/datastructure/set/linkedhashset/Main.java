package com.datastructure.set.linkedhashset;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(42);
        linkedHashSet.add(42);
        linkedHashSet.add(16);
        linkedHashSet.add(35);

        System.out.println(linkedHashSet);
    }
}

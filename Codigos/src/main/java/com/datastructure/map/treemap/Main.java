package com.datastructure.map.treemap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, Integer> integerMap = new TreeMap<>();

            integerMap.put(3, 2);
            integerMap.put(1, 1);
            integerMap.put(1, 1);
            integerMap.put(2, null);

        System.out.println(integerMap);
    }
}

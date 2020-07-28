package com.datastructure.map.linkedhashmap;

import java.util.LinkedHashMap;

public class Beta {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(null, 1);
        linkedHashMap.put(null, 1);
        linkedHashMap.put(1, 1);
        linkedHashMap.put(1, 1);
        linkedHashMap.put(2, 1);

        System.out.println(linkedHashMap);
    }
}

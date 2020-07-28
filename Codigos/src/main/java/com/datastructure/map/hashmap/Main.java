package com.datastructure.map.hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(2, 1);
        hashMap.put(null, 1);
        hashMap.put(3, null);
        hashMap.put(null, 1);
        hashMap.put(1, 1);
        hashMap.put(5, 6);
        hashMap.put(1, 1);

        System.out.println(hashMap);
    }
}

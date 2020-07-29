package com.datastructure.map.treemap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<House, String> integerMap = new TreeMap<>();
        House house = new House("Verde", "Vermelho");
        House house1 = new House("Azul", "Cinza");

            integerMap.put(house, "2");
            integerMap.put(house1, "1");

        System.out.println(integerMap);
    }
}

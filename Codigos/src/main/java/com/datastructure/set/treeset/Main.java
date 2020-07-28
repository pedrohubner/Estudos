package com.datastructure.set.treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        try {
            treeSet.add(22);
            treeSet.add(22);
            treeSet.add(5);
            treeSet.add(null);
        } catch (Exception e) {
            throw new RuntimeException("Não é possível adicionar elementos nulos");
        }

        System.out.println(treeSet);
    }
}

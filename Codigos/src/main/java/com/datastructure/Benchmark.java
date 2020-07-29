package com.datastructure;


import java.util.*;

public class Benchmark {
    public static void main(String[] args) {

        Stack<String> estrutura = new Stack<>();

        Long a = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            estrutura.add("012.345.678-90");
        }

        Long b = System.currentTimeMillis();

        Long sum = b - a;
        System.out.printf("Tempo para popular: %0,4d", sum);

        Long c = System.currentTimeMillis();

        for (int i = 500000; i > 0; i--) {
            estrutura.remove(i);
        }

        Long d = System.currentTimeMillis();

        Long sub = d - c;
        System.out.printf("\nTempo para remover: %0,4d", sub);
    }
}

package com.semanadois.estruturas;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {

        System.out.println("\nLista PriorityQueue");
        PriorityQueue <String> nome = new PriorityQueue<>();

        nome.add("Naã");
        nome.add("Rio");

        System.out.println(nome);

        System.out.println(nome.size());

        System.out.println(nome.peek());

        nome.poll();

        System.out.println(nome);

        System.out.println("\nLista Queue");
        Queue <String> nome1 = new LinkedList<>();

        nome1.add("Pedro");
        nome1.add("Davi");

        System.out.println(nome1);

        System.out.println(nome.size());

        System.out.println(nome1.peek());

        nome1.poll();

        System.out.println(nome1);

    }
}

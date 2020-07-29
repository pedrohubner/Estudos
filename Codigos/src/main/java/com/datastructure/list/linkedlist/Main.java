package com.datastructure.list.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fila> fila = new LinkedList<>();

        fila.add(new Fila("João Silva"));
        fila.add(new Fila("Marta Silva"));
        fila.add(new Fila("Marta Silva"));
        fila.add(null);

        System.out.println(fila);

        System.out.println(fila.get(2));
    }
}

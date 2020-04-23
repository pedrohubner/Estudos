package com.semanadois.estruturas;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) throws NullPointerException{

        /**
         * Lista HashSet
         */
        System.out.println("\nLista HashSet: ");
        HashSet<String> nome = new HashSet<>();

        nome.add("Fernandes");
        nome.add("Petra");
        nome.add("Luane");
        nome.add(null);
        nome.add(null);

        System.out.println(nome.isEmpty());

        System.out.println(nome.size());

        System.out.println(nome);

        nome.remove("Luane");

        System.out.println(nome);

        System.out.println(nome.contains("Petra"));

        Iterator valor = nome.iterator();

        System.out.println("\nOs valores são: ");
        while (valor.hasNext()){
            System.out.println(valor.next());
        }

        /**
         * Lista TreeSet
         */
        System.out.println("\nLista TreeSet: ");
        TreeSet<String> nome2 = new TreeSet<>();

        nome2.add("Fernandes");
        nome2.add("Petra");
        nome2.add("Luane");
        try {
            nome2.add(null);
            nome2.add(null);
        }catch (NullPointerException e){
            System.out.println("Não possível adicionar elemento.");
        }

        System.out.println(nome2.isEmpty());

        System.out.println(nome2.size());

        System.out.println(nome2);

        nome2.remove("Luane");

        System.out.println(nome2);

        System.out.println(nome2.contains("Petra"));

        Iterator valor2 = nome2.iterator();

        System.out.println("\nOs valores são: ");
        while (valor2.hasNext()){
            System.out.println(valor2.next());
        }

        /**
         * Lista LinkedHashSet
         */
        System.out.println("\nLista LinkedHashSet: ");
        LinkedHashSet<String> nome3 = new LinkedHashSet<>();

        nome3.add("Fernandes");
        nome3.add("Petra");
        nome3.add("Luane");
        nome3.add(null);
        nome3.add(null);

        System.out.println(nome3.isEmpty());

        System.out.println(nome3.size());

        System.out.println(nome3);

        nome.remove("Luane");

        System.out.println(nome3);

        System.out.println(nome3.contains("Petra"));

        Iterator valor3 = nome3.iterator();

        System.out.println("\nOs valores são: ");
        while (valor3.hasNext()){
            System.out.println(valor3.next());
        }

    }
}

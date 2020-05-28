package com.playground.exercicios3;

import java.util.ArrayList;

public class LojaVirtual {
    public static void main(String[] args) {

        ArrayList<Celular> produtos = new ArrayList<>();

        produtos.add(new Celular("iPhone 8", 8, 111));
        produtos.add(new Celular("Samsung JS7", 1, 221));
        produtos.add(new Celular("Samsung A9", 2, 301));

        produtos.forEach(p -> System.out.println(p.getModelo()));

        /**
         * Rever aulas de Stream dos 2 cursos
         * fazer código de novo e corrigir erro do forEach
         */
//        produtos.stream().filter(c -> c.getModelo().contains("Samsung"))
//                .sorted(Comparator.comparingDouble(Celular::getPreco))
//                .map(celular -> celular.getModelo().toUpperCase()).forEach();

        produtos.stream().filter(c -> c.getModelo().contains("nokia")).
                forEach(celular -> System.out.println(celular.getModelo()));

    }
}

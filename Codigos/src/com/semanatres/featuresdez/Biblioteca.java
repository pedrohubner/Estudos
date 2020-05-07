package com.semanatres.featuresdez;

import java.util.List;
import java.util.Set;

public class Biblioteca {
    public static void main(String[] args) {

        System.out.println("\nlista de livros:");

        var livro1 = "- Altered Carbon";
        var livro2 = "- Duna";
        var livro3 =  "- Fundação";
        var listaDeLivros = List.of(livro1, livro2, livro3);

        listaDeLivros.forEach(System.out::println);

        System.out.println("\nLista de nomes:");

        var setNomes = Set.of("- Samuel Meister Hübner", "- Davi Arthur Hübner");
        setNomes.forEach(System.out::println);

    }
}

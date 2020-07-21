package com.features.javaten;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    public static void main(String[] args) {

        System.out.println("\nSérie A:");

        var time1 = "- Internacional";
        var time2 = "- São Paulo";
        var time3 = "- Chapecoense";
        var classificacao = List.of(time1, time2, time3);

        classificacao.forEach(System.out::println);

        Livros livro = new Livros("\"Blade Runner\"", "Aleph", 252, 59.9,
                5);
        Livros livro2 = new Livros("\"O Homem No Castelo Alto\"", "Aleph", 376, 42.5,
                2);
        Livros livro3 = new Livros("\"Eu, Robô\"", "Aleph", 460, 39.9,
                6);

        List<Livros> estante = new ArrayList<>();

        estante.add(livro);
        estante.add(livro2);
        estante.add(livro3);

        Set<Livros> novaEstante = Set.copyOf(estante);

        System.out.println("\nLista de livros disponíveis na loja:");

        novaEstante.forEach(Livros::exibirLivros);

        System.out.println("\n" + livro2.checarEstoque(2));

//        Map<Integer, Livros> outraNovaEstante = Map.copyOf(num,estante);

    }
}

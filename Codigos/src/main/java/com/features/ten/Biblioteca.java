package com.features.ten;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {

        System.out.println("\nSérie A:");

        var time1 = "- Internacional";
        var time2 = "- São Paulo";
        var time3 = "- Chapecoense";
        var classificacao = List.of(time1, time2, time3);

        classificacao.forEach(System.out::println);

        Books livro = Books.builder()
                .build();
        Books livro2 = Books.builder()
                .titulo("The Man in The HighCastle")
                .build();
        Books livro3 = Books.builder()
                .titulo("I, Robot")
                .build();
        Books livro4 = Books.builder()
                .titulo("Clean Code")
                .build();
        Books books = Books.builder()
                .titulo("Caçador de Andróides")
                .build();

        List<Books> estante = new LinkedList<>();

        estante.add(livro);
        estante.add(livro2);
        estante.add(livro3);

        List<Books> novaEstante = List.copyOf(estante);

//        System.out.println("\nLista de livros disponíveis na loja:");
//
//        System.out.println("\nLivros nova estante: ");
//        novaEstante.forEach(Books::exibirLivros);

        System.out.println(livro.isEmpty());
    }
}

package com.semanatres.featuresdez;

import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {

        //Usando inferências da variáveis locais
        var livro1 = "Altered Carbon";
        var livro2 = "Duna";
        var livro3 =  "Fundação";
        var listaDeLivros = List.of("Fundação", "Altered Carbon", "Duna");

        System.out.println("\nLivros que encontrei na biblioteca ");
        for (var livro:listaDeLivros) {
            System.out.println(livro);
        }
    }
}

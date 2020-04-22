package com.semanadois.projeto;

import java.util.HashSet;
import java.util.Set;

public class Prateleira {
    public static void main(String[] args) {

        Set <String> produto = new HashSet<>();

        produto.add("Shampoo - R$5.50");
        produto.add("Desodorante - R$4.00");

        //Informa se a list Set está vazia
        System.out.println(produto.isEmpty());

        //Informa quantos elementos a lista Set possui
        System.out.println(produto.size());

        System.out.println(produto);

        //Tentando remover item da lista Set
        System.out.println(produto.remove(produto));

        System.out.println(produto);
    }
}

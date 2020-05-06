package com.playground.miniprojeto;

import java.util.ArrayList;

public class Compras {
    public static void main(String[] args) {

//        ArrayList <Produtos> listaProdutos = new ArrayList<>();
//        ArrayList <Produtos> listaProdutos2 = new ArrayList<>();

        Loja loja1 = new Loja("Panvel", "Zeca Neto, 48", 993309278);
        Loja loja2 = new Loja("Droga Raia", "Dorival Candido 55", 991324971);

        Produtos produto1 = new Produtos("Shampoo Axe", 8.5, 20, loja1);
        Produtos produto2 = new Produtos("Shampoo Rexona", 5.3, 17, loja1);
        Produtos produto3 = new Produtos("Shampoo Clear", 7.6, 12, loja1);

        Produtos produto4 = new Produtos("Shampoo Dove", 8.5, 20, loja2);
        Produtos produto5 = new Produtos("Shampoo Pantene", 5.3, 17, loja2);
        Produtos produto6 = new Produtos("Shampoo Head & Sholder's", 7.6, 12, loja2);

//        //Produtos loja 1
//        listaProdutos.add(produto1);
//        listaProdutos.add(produto2);
//
//        listaProdutos.add(produto3);
//
//        //Produtos loja 2
//        listaProdutos2.add(produto4);
//        listaProdutos2.add(produto5);
//        listaProdutos2.add(produto6);
//
//        System.out.println(listaProdutos);

        System.out.println(produto3.reporEstoque());

    }
}

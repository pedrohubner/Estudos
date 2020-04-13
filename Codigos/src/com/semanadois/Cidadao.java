package com.semanadois;
import java.util.*;

public class Cidadao {
    public static void main(String[] args) {

        //Fazer mapa de clientes e seus produtos (chave?, valor?)
        //Map <Mercado, Cliente> compra = new HashMap<>();
        //Fazer classe de classe mercado e depois instanciar um objeto produto para usar na Stack
        Stack <Mercado> produto = new Stack<>();
        //Fazer uma classe para clientes, que servirá para o queue (first in, first out)
        Queue <Cliente> fila = new LinkedList<>();
        //Map para associar cliente com a compra
        Map <Cliente, Mercado> compra = new HashMap<>();

        //Stack para uma lista de produtos que vão ser

        //produto sabonete
        Mercado produto11 = new Mercado("Sabonete Lux", 4.00, 8, 111);
        Mercado produto12 = new Mercado("Sabonete Rexona", 6.50, 10, 112);
        Mercado produto13 = new Mercado("Sabonete Panvel", 3.99, 12, 113);
        Mercado produto14 = new Mercado("Sabonete Glicerina", 5.00, 9, 114);
        //Produto Shampoo
        Mercado produto21 = new Mercado("Shampoo Clearmen", 12.15, 20, 221);
        Mercado produto22 = new Mercado("Shampoo Nivea", 9.50, 16, 222);
        Mercado produto23 = new Mercado("Shampoo Pantene", 15.49, 15, 223);
        Mercado produto24 = new Mercado("Shampoo Rexona", 8.99, 8, 224);
        //Produto desodorante
        Mercado produto31 = new Mercado("Desodorante Adidas", 7.99, 20, 331);
        Mercado produto32 = new Mercado("Desodorante Rexona", 5.80, 18, 332);
        Mercado produto33 = new Mercado("Desodorante Nivea", 6.50, 15, 333);
        Mercado produto34 = new Mercado("Desodorante Axe", 8.99, 24, 334);
        //Produto pão
        Mercado produto41 = new Mercado("Pão Farias", 2.99, 25, 441);
        Mercado produto42 = new Mercado("Pão Nutrella", 4.50, 18, 442);
        Mercado produto43 = new Mercado("Pão SevenBoys", 5.00, 17, 443);
        Mercado produto44 = new Mercado("Pão Bazotti", 3.99, 19, 444);

        //Sabonete
        produto.push(produto11);
        produto.push(produto12);
        produto.push(produto13);
        produto.push(produto14);
        //Shampoo
        produto.push(produto21);
        produto.push(produto22);
        produto.push(produto23);
        produto.push(produto24);
        //Desodorante
        produto.push(produto31);
        produto.push(produto32);
        produto.push(produto33);
        produto.push(produto34);
        //Pãos
        produto.push(produto41);
        produto.push(produto42);
        produto.push(produto43);
        produto.push(produto44);

        System.out.println(produto);

        //imprimindo o produto que está no topo
        System.out.println(produto.peek());

        //verificando se a lista de produtos está vazia
        System.out.println(produto.empty());

        //retirando o produto no topo
        produto.pop();

        System.out.println(produto);

        //Queue para fila de clientes
        Cliente cliente1 = new Cliente("Matthew", 490.0);
        Cliente cliente2 = new Cliente("Karen", 585.70);
        Cliente cliente3 = new Cliente("Franklin", 450.8);
        Cliente cliente4 = new Cliente("Wilson", 600.5);

        fila.add(cliente1);
        fila.add(cliente2);
        fila.add(cliente3);
        fila.add(cliente4);

        System.out.println("\n");

        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.size());

        fila.poll();

        System.out.println(fila);

        fila.poll();

        System.out.println(fila);

        compra.put(cliente1, produto23);
        compra.put(cliente3, produto41);
        compra.put(cliente2, produto12);
        compra.put(cliente4, produto34);

        System.out.println(compra);

//        fila.poll();
//
//        compra.put(fila.poll(), produto1);
        System.out.println(compra);
    }
}

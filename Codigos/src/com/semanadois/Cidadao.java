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
        Mercado produto1 = new Mercado("Sabonete", 4.50, 5, 111);
        Mercado produto2 = new Mercado("Shampoo", 10.00, 1, 222);
        Mercado produto3 = new Mercado("Desodorante", 7.99, 2, 333);
        Mercado produto4 = new Mercado("Pão", 3.99, 2, 444);

        produto.push(produto1);
        produto.push(produto2);
        produto.push(produto3);
        produto.push(produto4);

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

        compra.put(cliente1, produto2);
        compra.put(cliente3, produto4);
        compra.put(cliente2, produto1);
        compra.put(cliente4, produto3);

        System.out.println(compra);

//        fila.poll();
//
//        compra.put(fila.poll(), produto1);
        System.out.println(compra);
    }
}

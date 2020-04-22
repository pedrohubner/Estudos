package com.semanadois.exercicios;

import java.util.*;

public class Cidadao {
    public static void main(String[] args) throws IndexOutOfBoundsException{

        //Fazer classe de classe mercado e depois instanciar um objeto produto para usar na Stack
        List <Mercado> produto = new ArrayList<>();
        //Fazer uma classe para clientes, que servirá para o queue (first in, first out)
        Queue <Clientela> fila = new LinkedList<>();
        //Set para criar lista de produtos que entram no carrinho
        Set <Mercado> carrinho = new HashSet<>();
        //Map para associar cliente com a compra
        Map <Clientela, Mercado> compra = new HashMap<>();


        /**
         * Stack de quatro produtos e cada produto possui quatro tipos
         */
        //produto sabonete
        Mercado produto11 = new Mercado("Sabonete Lux", 4.00, 8, 111, true);
        Mercado produto12 = new Mercado("Sabonete Rexona", 6.50, 10, 112, true);
        Mercado produto13 = new Mercado("Sabonete Panvel", 8.99, 12, 113, true);
        Mercado produto14 = new Mercado("Sabonete Glicerina", 5.00, 9, 114, true);
        //Produto Shampoo
        Mercado produto21 = new Mercado("Shampoo Clearmen", 12.15, 20, 221, true);
        Mercado produto22 = new Mercado("Shampoo Nivea", 9.50, 16, 222, true);
        Mercado produto23 = new Mercado("Shampoo Pantene", 15.49, 15, 223, true);
        Mercado produto24 = new Mercado("Shampoo Rexona", 8.99, 8, 224, true);
        //Produto desodorante
        Mercado produto31 = new Mercado("Desodorante Adidas", 7.99, 20, 331, true);
        Mercado produto32 = new Mercado("Desodorante Rexona", 5.80, 18, 332, true);
        Mercado produto33 = new Mercado("Desodorante Nivea", 6.50, 15, 333, true);
        Mercado produto34 = new Mercado("Desodorante Axe", 8.99, 24, 334, true);
        //Produto pão
        Mercado produto41 = new Mercado("Pão Farias", 2.99, 25, 441, true);
        Mercado produto42 = new Mercado("Pão Nutrella", 4.50, 18, 442, true);
        Mercado produto43 = new Mercado("Pão SevenBoys", 5.00, 17, 443, true);
        Mercado produto44 = new Mercado("Pão Bazotti", 6.99, 19, 444, true);

        //Sabonete
        produto.add(produto11);
        produto.add(produto12);
        produto.add(produto13);
        produto.add(produto14);
        //Shampoo
        produto.add(produto21);
        produto.add(produto22);
        produto.add(produto23);
        produto.add(produto24);
        //Desodorante
        produto.add(produto31);
        produto.add(produto32);
        produto.add(produto33);
        produto.add(produto34);
        //Pãos
        produto.add(produto41);
        produto.add(produto42);
        produto.add(produto43);
        produto.add(produto44);

        System.out.println(produto);

        //imprimindo o produto que está no topo
        //System.out.println(produto.get(produto12.getQntd()));

        //verificando se a lista de produtos está vazia
        System.out.println(produto.isEmpty());

        //retirando o produto no topo
        produto.remove(produto12);

        System.out.println(produto);

        /**
         *Queue simulando uma fila de clientes
         */
        Clientela clientela1 = new Clientela("Matthew", 5, true);
        Clientela clientela2 = new Clientela("Karen", 585.70, true);
        Clientela clientela3 = new Clientela("Franklin", 450.8, true);
        Clientela clientela4 = new Clientela("Wilson", 600.5, true);

        fila.add(clientela1);
        fila.add(clientela2);
        fila.add(clientela3);
        fila.add(clientela4);

        System.out.println("\n");

        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.size());

        fila.poll();

        System.out.println(fila);

        fila.poll();

        System.out.println(fila);

        /**
         * Map para relacionar o cliente com o produto que irá comprar
         */
        compra.put(clientela1, produto23);
        compra.put(clientela3, produto41);
        compra.put(clientela2, produto12);
        compra.put(clientela4, produto34);

        //Método para exibir chaves
        System.out.println(compra.keySet());

        //Método para exibir valores
        System.out.println(compra.values());

        //Método para exibir chaves e valores
        System.out.println(compra.entrySet());

        System.out.println("\n");

        /**
         * Set para produtos que entram no carrinho
         */
        carrinho.add(produto11);
        carrinho.add(produto33);
        carrinho.add(produto24);

        System.out.println(carrinho);

        System.out.println("\n");

        try {
            clientela1.run();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Não foi possível efetuar a compra");
        }

        clientela4.entrarNoMercado();

        clientela4.setEntrar(false);

        clientela4.entrarNoMercado();

        //Thread caixa1 = new Thread(cliente2.run());
    }
}

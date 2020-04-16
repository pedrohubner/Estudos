package com.semanadois;
import java.util.*;

public class Cidadao {
    public static void main(String[] args) {

        //Fazer classe de classe mercado e depois instanciar um objeto produto para usar na Stack
        Stack <Mercado> produto = new Stack<>();
        //Fazer uma classe para clientes, que servirá para o queue (first in, first out)
        Queue <Cliente> fila = new LinkedList<>();
        //Set para criar lista de produtos que entram no carrinho
        Set <Mercado> carrinho = new HashSet<>();
        //Map para associar cliente com a compra
        Map <Cliente, Mercado> compra = new HashMap<>();

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

        /**
         *Queue simulando uma fila de clientes
         */
        Cliente cliente1 = new Cliente("Matthew", 10.0);
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

        /**
         * Map para relacionar o cliente com o produto que irá comprar
         * COLOCAR NO FIM DO CÓDIGO PARA UMA POSSÍVEL LISTA
         */
        compra.put(cliente1, produto23);
        compra.put(cliente3, produto41);
        compra.put(cliente2, produto12);
        compra.put(cliente4, produto34);

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

        System.out.println(cliente1.getNome() + " está passando no caixa para comprar o produto "
                + produto11.getProduto());
        System.out.println(cliente1.getNome() + " comprou o Sabonte e ficou com "
                + cliente1.comprarProduto() + " reais");

    }
}

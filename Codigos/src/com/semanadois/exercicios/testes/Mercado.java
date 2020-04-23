package com.semanadois.exercicios.testes;

import java.util.*;

public class Mercado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set <Produto> produtos = new HashSet<>();
        Queue < Cliente> clientes = new LinkedList<>();
        Map <Cliente, Produto> compras = new HashMap<>();
        Stack <Produto> prateleira1 = new Stack<>();
        Stack <Produto> prateleira2 = new Stack<>();

        Produto produto1 = new Produto("Shampoo 1", 8.9);
        Produto produto2 = new Produto("Shampoo 2", 10.0);
        Produto produto3 = new Produto("Sabonete 1", 3.5);
        Produto produto4 = new Produto("Sabonete 2", 4.9);

        Cliente cliente1 = new Cliente("Jonas", 63.5);
        Cliente cliente2 = new Cliente("Lauren", 94.36);

        /**
         * Add produtos à lista Set
         */
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

//        //Informa se a list Set está vazia
//        System.out.println(produto.isEmpty());
//
//        //Informa quantos elementos a lista Set possui
//        System.out.println(produto.size());
//
//        System.out.println(produto);
//
//        //Tentando remover item da lista Set
//        produto.remove(produto1);
//
//        System.out.println(produto);

        /**
         * Add clientes à fila
         */
        clientes.add(cliente1);
        clientes.add(cliente2);

//        //Visualiza qual o elemento que está na primeira posição
//        System.out.println(cliente.peek());
//
//        System.out.println(cliente);
//
//        //remove o elemento que está na primeira posição
//        cliente.poll();
//
//        System.out.println(cliente);

        /**
         * Add clientes(chaves) e produtos(valores) à map
         */
        compras.put(cliente2, produto1);
        compras.put(cliente1, produto2);

//        //Imprime chave e valores do Map
//        System.out.println(compra.entrySet());
//
//        //Imprime chaves do Map
//        System.out.println(compra.keySet());
//
//        //Imprime valores do Map
//        System.out.println(compra.values());
//
//        //Verifica se map está vazio
//        System.out.println(compra.isEmpty());
//
//        //Verifica quantidade de elementos no Map
//        System.out.println(compra.size());

        /**
         * Prateleira Shampoo
         */
        prateleira1.push(produto1);
        prateleira1.push(produto2);

        /**
         * Prateleira Sabonete
         */
        prateleira2.push(produto3);
        prateleira2.push(produto4);

//        //Verifica se a Stack está vazia
//        System.out.println(prateleira1.empty());
//
//        //Verifica último elemento da Stack
//        System.out.println(prateleira1.peek());
//
//        System.out.println(prateleira1);
//
//        //Remove elemento da Stack
//        prateleira1.pop();
//
//        System.out.println(prateleira1);

        System.out.println(produto4.aplicarDesconto());
        System.out.println(produto4.getPreco());

        System.out.println("\n=== Mercado ===\n Escolha uma das opções:\n 1 - Produtos\n 2 - Clientes\n" +
                " 3 - Compras\n 4 - Prateleiras de Shampoo\n 5 - Prateleiras de Sabonete");

        System.out.println("Digite a opção desejada: ");
        int escolha = input.nextInt();

        switch (escolha){
            case 1:
                System.out.println(produtos);
                break;

            case 2:
                System.out.println(clientes);
                break;

            case 3:
                System.out.println(compras);
                break;

            case 4:
                System.out.println(prateleira1);
                break;

            case 5:
                System.out.println(prateleira2);
                break;

            default:
                System.out.println("Opção inexistente");
                break;
        }
    }
}


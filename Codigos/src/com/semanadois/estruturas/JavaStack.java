package com.semanadois.projeto.estruturas;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {

        Stack <Integer> num = new Stack<>();

        num.push(1);
        num.push(2);
        num.push(3);
        num.push(3);
        num.push(4);
        num.push(5);

        //num.pop();

        System.out.println(num);

        //Imprime o último elemento, já que é o primeiro a sair
        System.out.println(num.peek());

        //Verifica se a Stack está vazia
        System.out.println(num.empty());

        //search procura o elemento pela sua índice
        //Por ser uma stack o último item (5) tem a primeira posição na lista
        System.out.println(num.search(5));

        //Por ser uma stack o primeiro item (5) tem a última posição na lista
        System.out.println(num.search(1));

        //Removendo elemento da lista
        num.pop();

        System.out.println(num);

    }
}

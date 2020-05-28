package com.playground.exercicios3;

public class TesteReferencia {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro", 78723);

        int idade = 18;

        fazerAniversario(idade, p1);

        System.out.println(p1);
        System.out.println(idade);

    }

    public static void fazerAniversario(int idade, Pessoa p1){
        int novaIdade = idade + 1;
        idade = novaIdade;

        p1.setNome("Pedro Naã tem " + novaIdade);
    }
}
package com.playground.miniprojeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Estudando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Estudante e1 = new Estudante("Julia", "j@gmail.com", 642581, 7, 6);
        Estudante e2 = new Estudante("João", "joao@gmail.com", 642582, 8, 7);
        Estudante e3 = new Estudante("Carlo", "carlo@gmail.com", 642583, 6, 2);
        Estudante e4 = new Estudante("Quezia", "quezia@gmail.com", 642584, 1, 4);
        Estudante e5 = new Estudante("Mario", "mario@gmail.com", 642585, 0, 3);

        List <Estudante> listaEstudantes = new ArrayList<>();

        listaEstudantes.add(e1);
        listaEstudantes.add(e2);
        listaEstudantes.add(e3);
        listaEstudantes.add(e4);
        listaEstudantes.add(e5);

        System.out.println("==Portal Acadêmico==\n===Menu===:\n 1 - Lista de alunos\n 2 - Média final do bimestre" +
                "\n 3 - Var com lambda");
        System.out.println("\nSeleciona a opção desejada:");
        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Lista de alunos: ");
                listaEstudantes.forEach(System.out::println);
                break;

            case 2:
                System.out.println("=====Média final do bimestre=====");
                if (e1.verificarAprovacaoBimestre() >= 6) {
                    System.out.println(e1.getNome().concat(" passou no bimestre. Nota final: ") +
                            e1.verificarAprovacaoBimestre());
                    System.out.println(e2.getNome().concat(" passou no bimestre. Nota final: ") +
                            e2.verificarAprovacaoBimestre());
                    System.out.println(e3.getNome().concat(" passou no bimestre. Nota final: ") +
                            e3.verificarAprovacaoBimestre());
                    System.out.println(e4.getNome().concat(" passou no bimestre. Nota final: ") +
                            e4.verificarAprovacaoBimestre());
                    System.out.println(e5.getNome().concat(" passou no bimestre. Nota final: ") +
                            e5.verificarAprovacaoBimestre());
                } else {
                    System.out.println(e1.getNome() + " reprovou no bimestre. Nota final: " +
                            e1.verificarAprovacaoBimestre());
                    System.out.println(e2.getNome() + " reprovou no bimestre. Nota final: " +
                            e2.verificarAprovacaoBimestre());
                    System.out.println(e3.getNome() + " reprovou no bimestre. Nota final: " +
                            e3.verificarAprovacaoBimestre());
                    System.out.println(e4.getNome() + " reprovou no bimestre. Nota final: " +
                            e4.verificarAprovacaoBimestre());
                    System.out.println(e5.getNome() + " reprovou no bimestre. Nota final: " +
                            e5.verificarAprovacaoBimestre());
                }
                break;

            case 3:
                System.out.println("Inferência de tipo com lambda expression sendo executada: ");
                Function <Integer, Integer> teste = (var n) -> n * 2;

                Integer executandoTeste = teste.apply(e3.verificarAprovacaoBimestre());

                System.out.println(executandoTeste);

                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
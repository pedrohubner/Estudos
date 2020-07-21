package com.features.javaeight;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 63185249L, 218, 8);
        Aluno a2 = new Aluno("Luciane", 3854752L, 202, 7);
        Aluno a3 = new Aluno("Luana", 14578238L, 101, 7);
        Aluno a4 = new Aluno("Carl", 2447523L, 301, 6);

        List<Aluno> listaAluno = new ArrayList<>();

        listaAluno.add(a1);
        listaAluno.add(a2);
        listaAluno.add(a3);
        listaAluno.add(a4);

        System.out.println("\nExibindo matrícula do aluno e seu nome:");
        listaAluno.stream()
                .map(a -> a.getMatricula() + " - " + a.getNome())
                .forEach(System.out::println);

        System.out.println("\nVerificando dados dos alunos: ");
        listaAluno.forEach(a -> System.out.println(a.verificarAprovacao()));

        System.out.println("\nVerificando alunos aprovados:");
        listaAluno.forEach(Aluno::exibeDados);

    }
}

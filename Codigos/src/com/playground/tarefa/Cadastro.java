package com.playground.tarefa;

import java.util.Scanner;

public class TesteFun4Study {
    public static void realizarCadastroCidade() {
        Scanner input = new Scanner(System.in);

        System.out.println("====Cadastro cidade====");

        System.out.println("Digite o nome da cidade: ");
        String nomeCidade = input.next();

        Cidade cidade = new Cidade(nomeCidade);

        System.out.println("\n===Cadastro estudante da cidade===");

        System.out.println("Digite o nome do(a) estudade");
        String nomeEstudante = input.next();
        System.out.println("Digite a matrícula do(a) estudante:");
        int matricula = input.nextInt();
        System.out.println("Digite a senha");
        String senha = input.next();
        String senhaNova = null;

        Estudante estudante = new Estudante(nomeEstudante, matricula, senha, senhaNova, cidade);

        System.out.println(cidade + "\n" + estudante);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Cadastro cidade===\n 1 - Cadastro cidade e estudante\n 0 - Encerrar operação");
        System.out.println("Digite a opção desejada: ");
        int escolha = input.nextInt();

        switch (escolha) {
            case 0:
                System.out.println("Operações encerradas.");
                System.exit(0);
                break;

            case 1:
                realizarCadastroCidade();

                System.out.println("\nDeseja cadastrar outra cidade e outros estudantes?"
                + "\nSim - 1\nNão - 0");

                int decisao = input.nextInt();

                if (decisao == 1)
                    realizarCadastroCidade();
                else if (decisao == 0) {
                    System.out.println("Operações encerradas.");
                    System.exit(0);
                } else System.out.println("Operação não disponível");
                break;

            default:
                System.out.println("Operação não disponível.");
                break;
        }
    }
}

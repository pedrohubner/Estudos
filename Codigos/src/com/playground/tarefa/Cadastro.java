package com.playground.tarefa;

import java.util.Scanner;

public class Cadastro {
    private static void realizarCadastroCidade() {
        Scanner input = new Scanner(System.in);

        System.out.println("====Cadastro cidade====");

        System.out.println("Digite o nome da cidade: ");
        String nomeCidade = input.nextLine();

        Cidade cidade = new Cidade(nomeCidade);

        System.out.println("\n===Cadastro estudante da cidade " +
                cidade.getNomeCidade() + "===");

        System.out.println("Digite o nome do(a) estudante:");
        String nomeEstudante = input.next();
        System.out.println("Digite a matrícula do(a) estudante:");
        int matricula = input.nextInt();
        System.out.println("Digite a senha:");
        String senha = input.next();
        String novaSenha = null;

        Estudante estudante = new Estudante(nomeEstudante, matricula, senha, novaSenha, cidade);

        System.out.println(cidade + "\n" + estudante);

        System.out.println("\n===Cadastro estudante da cidade " +
                cidade.getNomeCidade() + "===");

        System.out.println("Digite o nome do(a) estudante:");
        String nomeEstudante2 = input.next();
        System.out.println("Digite a matrícula do(a) estudante:");
        int matricula2 = input.nextInt();
        System.out.println("Digite a senha:");
        String senha2 = input.next();
        String novaSenha2 = null;

        Estudante estudante2 = new Estudante(nomeEstudante2, matricula2, senha2, novaSenha2, cidade);

        System.out.println(cidade + "\n" + estudante2);

        System.out.println("\n===Cadastro estudante da cidade " +
                cidade.getNomeCidade() + "===");

        System.out.println("Digite o nome do(a) estudante:");
        String nomeEstudante3 = input.next();
        System.out.println("Digite a matrícula do(a) estudante:");
        int matricula3 = input.nextInt();
        System.out.println("Digite a senha:");
        String senha3 = input.next();
        String novaSenha3 = null;

        Estudante estudante3 = new Estudante(nomeEstudante3, matricula3, senha3, novaSenha3, cidade);

        System.out.println(cidade + "\n" + estudante3);

        System.out.println("\n===Cadastro estudante da cidade " +
                cidade.getNomeCidade() + "===");

        System.out.println("Digite o nome do(a) estudante:");
        String nomeEstudante4 = input.next();
        System.out.println("Digite a matrícula do(a) estudante:");
        int matricula4 = input.nextInt();
        System.out.println("Digite a senha:");
        String senha4 = input.next();
        String novaSenha4 = null;

        Estudante estudante4 = new Estudante(nomeEstudante4, matricula4, senha4, novaSenha4, cidade);

        System.out.println(cidade + "\n" + estudante4);

        System.out.println("Lista de alunos da cidade " + nomeCidade);

        System.out.println(nomeEstudante);
        System.out.println(nomeEstudante2);
        System.out.println(nomeEstudante3);
        System.out.println(nomeEstudante4);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Cadastro cidade===\n 1 - Cadastro cidade e estudante;" +
                "\n 0 - Encerrar operação.");

        System.out.println("Digite a opção desejada: ");
        int escolha = input.nextInt();

        switch (escolha) {
            case 0:
                System.out.println("Operação encerrada.");
                System.exit(0);
                break;

            case 1:
                realizarCadastroCidade();

                System.out.println("\nDeseja cadastrar outra cidade e outros estudantes?"
                        + "\nSim - 1;\nNão - 0.");

                int decisao;

                do {
                    realizarCadastroCidade();

                    System.out.println("\nDeseja cadastrar outra cidade e outros estudantes?"
                            + "\nSim - 1;\nNão - 0.");

                    decisao = input.nextInt();

                } while (decisao == 1);

                if (decisao == 0) {
                    System.out.println("Operação encerrada");
                } else
                    System.out.println("Operação não disponível");
                break;

            default:
                System.out.println("Operação não disponível.");
                break;
        }
    }
}

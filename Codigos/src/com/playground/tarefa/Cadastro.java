package com.playground.tarefa;

import java.util.Scanner;

public class Cadastro {
    private static void realizarCadastroCidade() {
        Scanner input = new Scanner(System.in);

        System.out.println("====Cadastro cidade====");

        System.out.println("Digite o nome da cidade: ");
        String nomeCidade = input.next();

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

        System.out.println("Deseja atualizar a senha?\n Sim - 1\n Não - 0");
        
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

                    System.out.println("Deseja at");

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

package com.playground.tarefa;

import java.util.Scanner;

public class Cadastro {
    private static void realizarCadastroCidade() {
        Scanner input = new Scanner(System.in);

        System.out.println("====Cadastro cidade====");

        System.out.println("Digite o código da cidade:");
        int codigo = input.nextInt();
        input.nextLine();
        System.out.println("Digite o nome da cidade:");
        String descricao = input.nextLine();
        System.out.println("Digite o estado da cidade:");
        String uf = input.nextLine();

        Cidades cidade = new Cidades(codigo, descricao, uf, 4);

        for (int i = 1; i <= cidade.getQntdEstudantes(); i++) {
            System.out.println("\n===Cadastro estudante " + i + " da cidade " +
                    cidade.getDescricao() + "===");

            System.out.println("Digite o código do estudante:");
            int codigoAluno = input.nextInt();
            input.nextLine();
            System.out.println("Digite o nome do estudante:");
            String nome = input.nextLine();
            System.out.println("Digite a data de nascimento do estudante:");
            String dataNascimento = input.next();
            System.out.println("Digite o email do estudante:");
            String email = input.next();
            System.out.println("Digite a senha do estudante:");
            String senha = input.next();
            String senhaNova = null;
            String confirmarNovaSenha = null;

            Estudantes estudante = new Estudantes(codigoAluno, nome, dataNascimento, email, senha,
                    senhaNova, confirmarNovaSenha, cidade);

            estudante.alterarDados(cidade);
            System.out.println("Cidade: " + cidade.getDescricao() + "\nEstudante: " + estudante.getNome() +
                    "\nMatrícula: " + estudante.getCodigoAluno() + "\nEmail: " + estudante.getEmail());
        }
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
                        + "\nSim - 1;\nNão - 0.\nDigite a opção desejada:");

                int decisao = input.nextInt();

                while (decisao == 1) {
                    realizarCadastroCidade();

                    System.out.println("\nDeseja cadastrar outra cidade e outros estudantes?"
                            + "\nSim - 1;\nNão - 0.");

                    decisao = input.nextInt();
                }

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

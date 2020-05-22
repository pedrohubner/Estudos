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

            Estudantes estudante = new Estudantes(codigoAluno, nome,
                    dataNascimento, email, senha, cidade);

            estudante.alterarDados(cidade);
            MensagensDaTela.exibirDadosCadastro(cidade, estudante);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MensagensDaTela.mensagemInicial();

        System.out.println("Digite a opção desejada: ");
        int escolha = input.nextInt();

        switch (escolha) {
            case 0:
                MensagensDaTela.terminarOperacao();
                System.exit(0);
                break;

            case 1:
                realizarCadastroCidade();

                MensagensDaTela.mensagemNovoCadastro();

                int decisao = input.nextInt();

                while (decisao == 1) {
                    realizarCadastroCidade();

                    MensagensDaTela.mensagemNovoCadastro();

                    decisao = input.nextInt();
                }

                if (decisao == 0) {
                    MensagensDaTela.terminarOperacao();
                } else
                    MensagensDaTela.selecionarOpcaoIndisponivel();
                break;

            default:
                MensagensDaTela.selecionarOpcaoIndisponivel();
                break;
        }
    }
}

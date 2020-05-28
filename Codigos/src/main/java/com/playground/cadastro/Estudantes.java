package com.playground.cadastro;

import java.util.Scanner;

public class Estudantes {

    private int codigoAluno;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private Cidades cidade;

    Estudantes(int codigoAluno, String nome, String dataNascimento, String email, String senha,
               Cidades cidade) {

        this.codigoAluno = codigoAluno;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        cidade.addNovoEstudante();
    }

    int getCodigoAluno() {
        return codigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidades getCidade() {
        return cidade;
    }

    private void alterarNome() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o novo nome: ");
        String setNome = input.nextLine();

        if (!setNome.equals(nome)) {
            System.out.println("Nome alterado com sucesso");

            nome = setNome;
        } else if (setNome.equals(nome)) {
            System.out.println("Digite um nome diferente.");
            alterarNome();
        }
    }

    private void alterarEmail() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o novo email: ");
        String setEmail = input.nextLine();

        if (!setEmail.equals(email)) {
            System.out.println("Email alterado com sucesso");

            email = setEmail;
        }
    }

    private void alterarSenha() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nova senha: ");
        String novaSenha = input.nextLine();

        System.out.println("Confirme a nova senha: ");
        String confirmarNovaSenha = input.nextLine();

        if (novaSenha.equals(confirmarNovaSenha)) {
            System.out.println("\nSenha atualizada com sucesso!\n" + exibeDados());
        } else {
            System.out.println("\nERRO: AS SENHAS NÃO CONFEREM!\nTente novamente:");
            alterarSenha();
            alterarDados(cidade);
        }
    }

    void alterarDados(Cidades cidade) {
        Scanner input = new Scanner(System.in);

        MensagensDaTela.atualizarDados(nome);
        int escolha = input.nextInt();
        input.nextLine();

        if (escolha == 1) {
            MensagensDaTela.selecionarDadoAlteracao();
            int decisao = input.nextInt();
            input.nextLine();

            switch (decisao) {
                case 1:
                    alterandoNome();
                    break;

                case 2:
                    alterandoEmail();
                    break;

                case 3:
                    alterandoSenha();
                    break;

                default:
                    MensagensDaTela.selecionarOpcaoIndisponivel();
            }
        }
    }

    private void alterandoSenha() {
        alterarSenha();
        exibeDados();
        alterarDados(cidade);
    }

    private void alterandoNome() {
        alterarNome();
        exibeDados();
        alterarDados(cidade);
    }

    private void alterandoEmail() {
        alterarEmail();
        exibeDados();
        alterarDados(cidade);
    }

    private String exibeDados() {
        return "\nCidade: " + cidade.getDescricao() + "\nEstudante: " + nome +
                "\nMatrícula: " + codigoAluno + "\nEmail: " + email;
    }
}
package com.playground.tarefa;

import java.util.Scanner;

public class Estudantes {

    private int codigoAluno;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senhaAntiga;
    private String senhaNova;
    private String confirmarNovaSenha;
    private Cidades cidade;

    Estudantes(int codigoAluno, String nome, String dataNascimento, String email, String senhaAntiga,
               String senhaNova, String confirmarNovaSenha, Cidades cidade) {

        this.codigoAluno = codigoAluno;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senhaAntiga = senhaAntiga;
        this.senhaNova = senhaNova;
        this.confirmarNovaSenha = confirmarNovaSenha;
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

    public String getSenhaAntiga() {
        return senhaAntiga;
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

        if (!setNome.equals(nome)&& setNome != null) {
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

        if (!setEmail.equals(email) && setEmail != null) {
            System.out.println("Email alterado com sucesso");

            email = setEmail;
        }
    }

    private void alterarSenha() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nova senha: ");
        senhaNova = input.nextLine();

        System.out.println("Confirme a nova senha: ");
        confirmarNovaSenha = input.nextLine();

        if (senhaNova.equals(confirmarNovaSenha)) {
            System.out.println("\nSenha atualizada com sucesso!\n" + exibeDados());
        } else {
            System.out.println("\nERRO: AS SENHAS NÃO CONFEREM!\nTente novamente:");
            alterarSenha();
            alterarDados(cidade);
        }
    }

    void alterarDados(Cidades cidade) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n" + getNome() + ", deseja atualizar algum dado?\nSim - 1\nNão - 0");
        System.out.println("\nSelecione a opção desejada");
        int escolha = input.nextInt();
        input.nextLine();

        if (escolha == 1) {
            System.out.println("Seleciona o dado que você deseja alterar:\n 1 - nome;" +
                    "\n 2 - email;\n 3 - senha.");
            int decisao = input.nextInt();
            input.nextLine();

            if (decisao == 1) {

                alterarNome();
                exibeDados();
                alterarDados(cidade);

            } else if (decisao == 2) {

                alterarEmail();
                exibeDados();
                alterarDados(cidade);

            } else if (decisao == 3) {

                alterarSenha();
                exibeDados();
                alterarDados(cidade);

            } else System.out.println("Opção não disponível");
        }
    }

    public void cadastrarEstudante() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n===Cadastro estudante da cidade " +
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

    private String exibeDados() {
        return "\nCidade: " + cidade.getDescricao() + "\nEstudante: " + nome +
                "\nMatrícula: " + codigoAluno + "\nEmail: " + email;
    }

    @Override
    public String toString() {
        return nome + " aluno da Faculdade TAL (código: " + codigoAluno + ") faz seu curso na modalidade " +
                "EAD, devido à " + " distância do polo.";
    }
}
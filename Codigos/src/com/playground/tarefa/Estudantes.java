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
    Cidades cidade;

    public Estudantes(int codigoAluno, String nome, String dataNascimento, String email, String senhaAntiga,
                      String senhaNova, String confirmarNovaSenha, Cidades cidade){

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

    public int getCodigoAluno(){
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno){
        this.codigoAluno = codigoAluno;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenhaAntiga() {
        return senhaAntiga;
    }

    public void setSenhaAntiga(String senhaAntiga) {
        this.senhaAntiga = senhaAntiga;
    }

    public String getSenhaNova() {
        return senhaNova;
    }

    public void setSenhaNova(String senhaNova) {
        this.senhaNova = senhaNova;
    }

    public String getConfirmarNovaSenha() {
        return confirmarNovaSenha;
    }

    public void setConfirmarNovaSenha(String confirmarNovaSenha) {
        this.confirmarNovaSenha = confirmarNovaSenha;
    }

    public void exibeDados(){
        System.out.println(nome + " aluno da Faculdade TAL (código: " + codigoAluno + ") faz seu curso na modalidade " +
                "EAD, devido à " + " distância do polo.");
    }

    public void alterarSenha(Cidades cidade){
        Scanner input = new Scanner(System.in);

        System.out.println("\n===" + getNome() + ", deseja atualizar a senha?\nSim - 1\nNão - 0");
        System.out.println("\nSelecione a opção desejada");
        int escolha = input.nextInt();
        input.nextLine();

        //TODO arrumar código pós erro para exibir mensagem solicitando para digitar novamente a senha
        if (escolha == 1) {
            System.out.println("Digite a nova senha: ");
            senhaNova = input.nextLine();

            System.out.println("Confirme a nova senha: ");
            confirmarNovaSenha = input.nextLine();

            if(senhaNova.equals(confirmarNovaSenha)){
                System.out.println("\nSenha atualizada com sucesso!\n" + cidade + "\n" + nome + "\n" + email);
            }else{
                System.out.println("\nERRO: AS SENHAS NÃO CONFEREM!\nTente novamente:");
                alterarSenha(cidade);
            }
        } else if (escolha == 0) {
            System.out.println(cidade + "\n" + nome + "\n" + email);
        } else System.out.println("Opção não disponível");
    }

    @Override
    public String toString() {
        return nome + " aluno da Faculdade TAL (código: " + codigoAluno + ") faz seu curso na modalidade " +
                "EAD, devido à " + " distância do polo.";
    }
}
package com.playground.tarefa;

public class Estudante {

    private String nomeEstudante;
    private int matricula;
    private String senha;
    private String senhaNova;
    private Cidade cidade;

    Estudante(String nomeEstudante, int matricula, String senha, String senhaNova, Cidade cidade) {
        this.nomeEstudante = nomeEstudante;
        this.matricula = matricula;
        this.senha = senha;
        this.senhaNova = senhaNova;
        this.cidade = cidade;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaNova() {
        return senhaNova;
    }

    public void setSenhaNova(String senhaNova) {
        this.senhaNova = senhaNova;
    }

    public Cidade getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Nome estudante: " + nomeEstudante + "\nMatrícula: " + matricula;
    }
}

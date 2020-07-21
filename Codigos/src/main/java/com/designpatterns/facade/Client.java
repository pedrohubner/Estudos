package com.designpatterns.facade;

public class Client {

    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private long cpf;

    public Client(String nome, String sobrenome, String dataNascimento, long cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public long getCpf() {
        return cpf;
    }

    public String perfilCliente() {
        return "=====Perfil cliente====="
        + "\nNome: " + nome + " " + sobrenome
        + "\nCPF: " + cpf;
    }
}

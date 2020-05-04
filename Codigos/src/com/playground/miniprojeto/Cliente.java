package com.playground.miniprojeto;

public class Cliente {

    private String nome;
    private String endereco;
    private String email;
    private long telefone;
    private String cpf;
    private double qntdDinheiro;

    public Cliente(String nome, String endereco, String email, long telefone, String cpf, double qntdDinheiro){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.qntdDinheiro = qntdDinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getQntdDinheiro() {
        return qntdDinheiro;
    }

    public void setQntdDinheiro(double qntdDinheiro) {
        this.qntdDinheiro = qntdDinheiro;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
    }
}

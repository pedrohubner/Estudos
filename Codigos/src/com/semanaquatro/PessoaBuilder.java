package com.semanaquatro;

public class PessoaBuilder {

    private Pessoa pessoa;
    private Endereco endereco;

    public PessoaBuilder(){
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
    }

    public static PessoaBuilder pessoa(){
        return new PessoaBuilder();
    }

    public PessoaBuilder addNome(String nome, String sobrenome){
        this.pessoa.setNome(nome);
        this.pessoa.setSobrenome(sobrenome);
        return this;
    }

    public PessoaBuilder addIdade(int idade){
        this.pessoa.setIdade(idade);
        return this;
    }

    public PessoaBuilder addDataNascimento(int dia, int mes, int ano){
        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);
        return this;
    }

    public PessoaBuilder addRua(String rua){
        this.endereco.setRua(rua);
        return this;
    }

    public PessoaBuilder addNumero(int numero){
        this.endereco.setNumero(numero);
        return this;
    }

    public PessoaBuilder addBairro(String bairro){
        this.endereco.setBairro(bairro);
        return this;
    }

    public PessoaBuilder addCidade(String cidade){
        this.endereco.setCidade(cidade);
        return this;
    }

    public Pessoa get(){
        this.pessoa.setEndereco(endereco);
        return this.pessoa;
    }
}

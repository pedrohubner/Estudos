package com.semanaquatro;

 class PessoaBuilder {

    private Pessoa pessoa;
    private Endereco endereco;

    public PessoaBuilder(){
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
    }

    public static PessoaBuilder pessoa(){
        return new PessoaBuilder();
    }
}

package com.semanaquatro;

public class TesteBuilder {

    private Pessoa pessoa;
    private Endereco endereco;

    public TesteBuilder(){
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
    }

    public static TesteBuilder pessoa(){
        return new TesteBuilder();
    }
}

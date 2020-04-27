package com.semanadois.projeto.mutabilidade;

public class JavaImmutable {

    private final String nome;
    private final int idade;

    public JavaImmutable(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " tem " + idade + " anos";
    }
}

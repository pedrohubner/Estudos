package com.semanaquatro.builder;

public class Beta4 {
    public static void main(String[] args) {

        PessoaBuilder pessoaBuilder = new PessoaBuilder()
                .addNome("Garreth", "Bale")
                .addIdade(35)
                .addDataNascimento(20, 11, 1988)
                .addRua("Forest Hill")
                .addNumero(616)
                .addBairro("Queens")
                .addCidade("New York");

        Pessoa pessoa = pessoaBuilder.get();

        System.out.println("\n" + pessoa);
    }
}

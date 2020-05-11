package com.semanaquatro;

public class Beta4 {
    public static void main(String[] args) {
        System.out.println("Classe para exemplos dos conteúdos da semana quatro");

        PessoaBuilder pessoaBuilder = new PessoaBuilder()
                .addNome("Pedro", "Hübner")
                .addIdade(18)
                .addDataNascimento(20, 11, 2001)
                .addRua("Forest Hill")
                .addNumero(616)
                .addBairro("Queens")
                .addCidade("New York");

        Pessoa pessoa = pessoaBuilder.get();

        System.out.println("\n" + pessoa);
    }
}

package com.playground.builder;

public class MatriculaAluno {
    public static void main(String[] args) {

        AlunoBuilder novoAluno = new AlunoBuilder()
                .addNome("Lucas", "Silveira")
                .addDataNascimento("16/", "04/", "2003")
                .addMatricula(564812);

        Aluno aluno = novoAluno.get();

        System.out.println(aluno);
    }
}

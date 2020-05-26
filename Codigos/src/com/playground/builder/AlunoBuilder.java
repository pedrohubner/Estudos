package com.playground.builder;

public class AlunoBuilder {

    private Aluno aluno;

    AlunoBuilder() {
        this.aluno = new Aluno();
    }

    AlunoBuilder addNome(String nome, String sobrenome) {
        this.aluno.setNome(nome);
        this.aluno.setSobrenome(sobrenome);
        return this;
    }

    AlunoBuilder addDataNascimento(String dia, String mes, String ano) {
        this.aluno.setDia(dia);
        this.aluno.setMes(mes);
        this.aluno.setAno(ano);
        return this;
    }

    AlunoBuilder addMatricula(int matricula) {
        this.aluno.setMatricula(matricula);
        return this;
    }

    AlunoBuilder addNotas(int nota1, int nota2) {
        this.aluno.setNota1(nota1);
        this.aluno.setNota2(nota2);
        return this;
    }

    Aluno get() {
        return this.aluno;
    }
}

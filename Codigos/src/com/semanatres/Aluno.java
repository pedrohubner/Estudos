package com.semanatres;

public class Aluno implements Math{

    private String nome;
    private int turma;

    public Aluno(String nome, int turma){
        this.nome = nome;
        this.turma =  turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    @Override
    public void soma() {

        try {
            soma();
        }catch (StackOverflowError e){
            System.out.println(nome + " errou a operação");
        }
    }

    @Override
    public void divisao() {

        int a = 4;
        int b = 2;

        int div = a / b;

        System.out.println(div);

    }
}

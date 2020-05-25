package com.playground.builder;

public class Aluno extends Pessoa{

    private int matricula;
    private double nota1;
    private double nota2;

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getSobrenome() {
        return super.getSobrenome();
    }

    @Override
    public String getAno() {
        return super.getAno();
    }

    @Override
    public String getDia() {
        return super.getDia();
    }

    @Override
    public String getMes() {
        return super.getMes();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nMatrícula: " + matricula;
    }
}

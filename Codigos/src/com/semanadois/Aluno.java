package com.semanadois;

public class Aluno extends Pessoa {
    private int matricula;
    private double nota1, nota2;

    public Aluno(int matricula, double nota1, double nota2, String nome, int idade, String dataNascimento,
                 double altura, double peso, char sexo, String endereco){
        super( nome, idade, dataNascimento, altura, peso, sexo, endereco);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return nota1 + nota2 / 2;
    }

    @Override
    public String toString() {
        return "A aluna " + getNome() + " atingiu as seguintes notas: " + nota1 + ", " + nota2 + ".\n"
        + "Alcançando uma média de " + calcularMedia();
    }
}

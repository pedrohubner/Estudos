package com.semanatres.featuresoito;

public class Aluno {

    private String nome;
    private long matricula;
    private int turma;
    private int notaSemestre1;
    private int notaSemestre2;

    public Aluno(String nome, long matricula, int turma, int notaSemestre1, int notaSemestre2){
        this.nome = nome;
        this.matricula = matricula;
        this.turma =  turma;
        this.notaSemestre1 = notaSemestre1;
        this.notaSemestre2 = notaSemestre2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public int getNotaSemestre1() {
        return notaSemestre1;
    }

    public void setNotaSemestre1(int notaSemestre1) {
        this.notaSemestre1 = notaSemestre1;
    }

    public int getNotaSemestre2() {
        return notaSemestre2;
    }

    public void setNotaSemestre2(int notaSemestre2) {
        this.notaSemestre2 = notaSemestre2;
    }

    public void passouDeAno(){
        int soma = notaSemestre1 + notaSemestre2 / 2;

        if (soma >= 60){
            System.out.println(nome + " passou de ano.\nNota: " + soma);
        }else System.out.println(nome + " reprovou de ano.");
    }

    public void exibeDados(){
        System.out.println("Aluno(a) " + nome + "(" + matricula + ") da turma " + turma + ".");
    }

    @Override
    public String toString() {
        return  nome + " da turma " + turma;
    }

}

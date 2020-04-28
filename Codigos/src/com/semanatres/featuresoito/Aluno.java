package com.semanatres.featuresoito;

public class Aluno implements OpBasicas {

    private String nome;
    private int turma;
    private int nota1;
    private int nota2;
    private static int nota3;
    private static int nota4;
    private boolean pedido;

    public Aluno(String nome, int turma, int nota1, int nota2, int nota3, int nota4,  boolean pedido){
        this.nome = nome;
        this.turma =  turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.pedido = pedido;
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

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public boolean isPedido() {
        return pedido;
    }

    public void setPedido(boolean pedido) {
        this.pedido = pedido;
    }

    public void exibeDados(){
        System.out.println("O(a) aluno(a) " + nome + " atingiu a nota final de: " + (nota1 + nota2));
    }

    public static int multiply(){

        return nota3*nota4;
    }

    @Override
    public String toString() {
        return "\n" + nome + " da turma " + turma;
    }

    //Implementação do método default da classe OpBasicas
    @Override
    public int soma() {

        return nota2 + nota1;
    }

    //Implementação do método de OpBasicas
    @Override
    public void subtrai() {

        int a = 49;
        int b = 26;

        int div = a - b;

        System.out.println(div);

    }

}

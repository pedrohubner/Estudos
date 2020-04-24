package com.semanatres.featuresoito;

public class Aluno implements Math {

    private String nome;
    private int turma;
    private int nota1;
    private int nota2;
    private boolean pedido;

    public Aluno(String nome, int turma, int nota1, int nota2, boolean pedido){
        this.nome = nome;
        this.turma =  turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
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

    public boolean isPedido() {
        return pedido;
    }

    public void setPedido(boolean pedido) {
        this.pedido = pedido;
    }

    /**
     * Método com loop, descobrir como consertar
     * e refazer teste
     *
     * @return
     */
    public boolean trocarDeTurma(){
         try {
             if (pedido == true) {
                 turma++;
             }
         }catch (StackOverflowError e){
             System.out.println("Não deu certo burro");
         }
         return trocarDeTurma();
    }

    @Override
    public String toString() {
        return "\n" + nome + " da turma " + turma;
    }

    //Implementação do método default da classe Math
    @Override
    public int soma() {

        return soma();
    }

    //Implementação do método de Math
    @Override
    public void divisao() {

        int a = 4;
        int b = 2;

        int div = a / b;

        System.out.println(div);

    }

}

package com.features.javaeight;

public class Aluno implements Conselho{

    private String nome;
    private Long matricula;
    private Integer turma;
    private Integer notaFinal;

    public Aluno(String nome, Long matricula, Integer turma, Integer notaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.turma =  turma;
        this.notaFinal = notaFinal;
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

    public Integer getNotaFinal(){
        return notaFinal;
    }

    public void setNotaFinal(Integer notaFinal){
        this.notaFinal = notaFinal;
    }

    public String exibeDados(){
        return "Aluno(a) " + nome + "(" + matricula + ") da turma " + turma + ".";
    }

    @Override
    public String toString() {
        return  nome + " da turma " + turma;
    }

    @Override
    public String verificarAprovacao() {
        if (notaFinal >= 6){
            return nome + " foi aprovado. Nota final: " + notaFinal ;
        }else
            return nome + " foi reprovado. Nota final: " + notaFinal ;
    }
}

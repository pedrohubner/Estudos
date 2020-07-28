package com.features.eight;

public class Aluno {

    private String nome;
    private Integer notaFinal;

    public Aluno(String nome, Integer notaFinal){
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNotaFinal(){
        return notaFinal;
    }

    public void setNotaFinal(Integer notaFinal){
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return  nome;
    }
}

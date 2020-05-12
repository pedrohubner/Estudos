package com.playground.miniprojeto;

public class Estudante {

    private String nome;
    private String email;
    private Integer matricula;
    private Integer nota1;
    private Integer nota2;

    public Estudante(String nome, String email, Integer matricula, Integer nota1, Integer nota2){
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer verificarAprovacaoBimestre(){
        int somaNotas = (nota1 + nota2) / 2;
        return somaNotas;
    }

    @Override
    public String toString() {
        return nome + " - ID: " + matricula;
    }
}

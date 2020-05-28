package com.semanadois.referencias;

public class Aluno {

    private String nome;
    private int idade;
    private int id;
    private String email;

    public Aluno(String nome, String email, int idade, int id){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aluna(o): " + nome + "\nEmail: " + email + "\nCarteira de estudante: " + id;
    }
}
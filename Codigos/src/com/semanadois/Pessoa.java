package com.semanadois;

public class Pessoa {

    private String nome;
    private int idade;
    private  String dataNascimento;
    private double altura;
    private double peso;
    private char sexo;
    private String endereco;

    public Pessoa(String nome, int idade, String dataNascimento, double altura, double peso, char sexo,
                  String endereco){
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this. endereco = endereco;
    }

    public String getNome(){
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void fazerAniversario(){
         idade++;
    }
}

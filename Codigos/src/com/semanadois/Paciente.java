package com.semanadois;

public class Paciente extends Pessoa {
    private char tipoSanguineo;
    private char resultado;

    public Paciente(String nome, int idade, String dataNascimento, double altura, double peso, char sexo,
                    String endereco, char tipoSanguineo, char resultado){
        super(nome, idade, dataNascimento, altura, peso, sexo, endereco);
        this.tipoSanguineo = tipoSanguineo;
        this.resultado = resultado;
    }

    public char getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(char tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public char getResultado() {
        return resultado;
    }

    public void setResultado(char resultado) {
        this.resultado = resultado;
    }

    public void exibirHistorico(){
        System.out.println("");
    }
}

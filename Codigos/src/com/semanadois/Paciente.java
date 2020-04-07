package com.semanadois;

public class Paciente extends Pessoa implements Comparable{
    private String tipoSanguineo;
    private char resultado;

    public Paciente(String nome, int idade, String dataNascimento, double altura, double peso, char sexo,
                    String endereco, String tipoSanguineo, char resultado){
        super(nome, idade, dataNascimento, altura, peso, sexo, endereco);
        this.tipoSanguineo = tipoSanguineo;
        this.resultado = resultado;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
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

    @Override
    public String toString() {
        return getNome() + ": " + getResultado();
    }

    @Override
    public int compareTo(Object outro) {
        Paciente aux = (Paciente)outro;
        if (this.getIdade() < aux.getIdade()){
            return -1;
        }else if (this.getIdade() > aux.getIdade()){
            return 1;
        } else {
            return 0;
        }
    }
}

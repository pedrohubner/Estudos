package com.playground.miniprojeto;

public class Estudando {
    public static void main(String[] args) {

        Estudante e1 = new Estudante("Julia", "j@gmail.com", 642581, 7, 6);

        for (int i = 0; i < 5; i++){
            if (e1.verificarAprovacaoBimestre() >= 6)
                System.out.println(e1.getNome().concat(" passou no bimestre. Nota final: ")  +
                        e1.verificarAprovacaoBimestre());
            else System.out.println(e1.getNome() + " reprovou no bimestre. Nota final: " +
                    e1.verificarAprovacaoBimestre());
        }
    }
}

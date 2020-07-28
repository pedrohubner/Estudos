package com.features.eight;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    public static void main(String[] args) {

        Conselho notaFinal = (a, b) ->  a * b;

        List<Aluno> listaAluno = new ArrayList<>();

        listaAluno.add(new Aluno("Predo", 0));
        listaAluno.add(new Aluno("Luquinhas", 0));
        listaAluno.add(new Aluno("Irineu", 0));
        listaAluno.add(new Aluno("Douglas", 0));
    }
}

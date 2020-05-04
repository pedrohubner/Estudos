package com.semanatres.featuresoito;

import java.util.ArrayList;

public class Aula {
    public static void main(String[] args) throws Exception{

        /**
         * EXEMPLOS DE LAMBDA EXPRESSIONS E METHOD REFERENCES
         */
        ArrayList <Aluno> boletim = new ArrayList<>();

        Aluno a1 = new Aluno("João", 112, 48, 89, 48, 88, true);
        Aluno a2 = new Aluno("Luciane", 306, 62, 60, 39, 60, true);
        Aluno a3 = new Aluno("Luana", 105, 51, 15, 72, 102, true);
        Aluno a4 = new Aluno("Carl", 203, 89, 35, 99, 20, true);

        //Criando threads para cada aluno e imprimindo usando lambda expression
        Thread t1 = new Thread(() -> System.out.println(a1));
        t1.start();

        Thread t2 = new Thread(() -> System.out.println(a2));
        t2.start();

        Thread t3 = new Thread(() -> System.out.println(a3));
        t3.start();

        Thread t4 = new Thread(() -> System.out.println(a4));
        t4.start();

        boletim.add(a1);
        boletim.add(a2);
        boletim.add(a3);
        boletim.add(a4);

        //método da instância de um objeto particular


        boletim.forEach(Aluno::exibeDados);


//        /**
//         * Implementando método abstrato 'subtrai' da interface funcional 'OpBasicas'
//         * e preenchendo com dados int de objeto da classe Aluno
//         */
//        OpBasicas m1 = new OpBasicas() {
//            @Override
//            public void media() {
//
//                int a = a4.getNota1();
//                int b = a4.getNota2();
//
//                int div = a - b;
//
//                System.out.println("\n45 : 5 = " + div);
//            }
//        };
//
//        //Imprimindo default method de interface funcional OpBasicas
//        m1.soma();
//
//        m1.media();
//
//        //método de instância
//        OpBasicas m3 = a1::media;
        
    }
}

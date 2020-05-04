package com.semanatres.featuresoito;

import java.util.ArrayList;

public class Aula {
    public static void main(String[] args) throws Exception{

        /**
         * EXEMPLOS DE LAMBDA EXPRESSIONS E METHOD REFERENCES
         */
        ArrayList <Aluno> boletim = new ArrayList<>();

        Aluno a1 = new Aluno("João", 63185249, 218, 80, 60);
        Aluno a2 = new Aluno("Luciane", 3854752, 202, 60, 89);
        Aluno a3 = new Aluno("Luana", 14578238, 101, 70, 70);
        Aluno a4 = new Aluno("Carl", 2447523, 301, 90, 90);

        //Criando threads para cada aluno e imprimindo usando lambda expression
        Thread t1 = new Thread(() -> System.out.println(a1));
        Thread t2 = new Thread(() -> System.out.println(a2));
        Thread t3 = new Thread(() -> System.out.println(a3));
        Thread t4 = new Thread(() -> System.out.println(a4));

        boletim.add(a1);
        boletim.add(a2);
        boletim.add(a3);
        boletim.add(a4);

//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        boletim.stream()
                .filter(a -> a.getNome().startsWith("C"))
                .map(a -> a.getNotaSemestre2())
                .forEach(System.out::println);

        a1.passouDeAno();

//        System.out.println("====Exibindo dados dos alunos====");
//        //método da instância de um objeto particular
//        boletim.forEach(Aluno::exibeDados);

    }
}

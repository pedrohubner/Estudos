package com.semanatres.featuresoito;

public class Aula {
    public static void main(String[] args) throws Exception{

        Aluno a1 = new Aluno("João", 203, 52, 34, true);
        Aluno a2 = new Aluno("Luciane", 126, 48, 22, true);
        Aluno a3 = new Aluno("Lauane", 302, 56, 42, true);
        Aluno a4 = new Aluno("Barbosa", 105, 52, 58, true);

        //Criando threas para cada aluno
        Thread t1 = new Thread(() -> System.out.println(a1));
        t1.start();

        a2.trocarDeTurma();

        Thread t2 = new Thread(() -> System.out.println(a2.trocarDeTurma()));
        t2.start();

        Thread t3 = new Thread(() -> System.out.println(a3));
        t3.start();

        Thread t4 = new Thread(() -> System.out.println(a4));
        t4.start();


        Math m1 = new Math() {
            @Override
            public void divisao() {

                int a = a4.getNota1();
                int b = a4.getNota2();

                int div = a / b;

                System.out.println("\n45 : 5 = " + div);
            }
        };

        m1.soma();

        m1.divisao();

        try {
            Math m2 = () -> System.out.println("\n4 dividido por 2 é igual a " + a2.getNota1()/a2.getNota2());
            m2.divisao();
        }catch (ArithmeticException e){
            System.out.println("\nNão foi possível efetuar divisão");
        }

    }
}

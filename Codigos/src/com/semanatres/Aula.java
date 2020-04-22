package com.semanatres;

public class Aula {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 103);

        Thread t1 = new Thread(() -> System.out.println(a1.getTurma()));
        t1.start();


        Math m1 = new Math() {
            @Override
            public void divisao() {

                int a = 6;
                int b = 3;

                int div = a / b;

                System.out.println(div);
            }
        };

        m1.soma();

        m1.divisao();

        Math m2 = () -> System.out.println("Realizando operação de divisão: ");

        m2.divisao();

    }
}

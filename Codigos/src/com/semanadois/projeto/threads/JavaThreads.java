package com.semanadois.projeto.threads;

interface Foto{

    //Criando método default
    default public int desenhar(){
        int a = 1;
        int b = 2;

        System.out.println("Desenhando retângulo de " + a + "cm de altura e " + b + " cm de largura");
        return desenhar();
    }

    //Criando único método abstrato
    public void tirarFoto();
}

public class JavaThreads implements Runnable{
    public static void main(String[] args) {

        //Thread usando lambda expression
        Thread t1 = new Thread(() -> System.out.println("\nTirando foto"));

        t1.start();

        Foto f1 = new Foto() {
            @Override
            public void tirarFoto() {
                System.out.println("Pessoa tirou foto");
            }
        };

        Thread t2 =  new Thread();

        t2.run();

//        Foto foto1 = new Foto() {
//            @Override
//            public void tirarFoto() {
//                System.out.println("Tirando foto");
//            }
//        };
//
//        foto1.tirarFoto();
//
//        //Utilizando lambda expression
//        Foto foto2 = () -> System.out.println("Tirando outra foto");
//
//        foto2.tirarFoto();
//
//        //Implementando método default
//        foto2.desenhar();

    }

    @Override
    public void run() {

    }
}

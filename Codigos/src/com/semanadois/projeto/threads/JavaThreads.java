package com.semanadois.projeto.threads;

interface Foto{

    //Criando método default
    default public void desenhar(){
        int a = 1;
        int b = 2;

        System.out.println("Desenhando retângulo de " + a + "cm de altura e " + b + " cm de largura");
    }

    //Criando único método abstrato da interface
    public void tirarFoto();
    
}

public class JavaThreads {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> System.out.println("Executando"));

        t1.start();

        Foto foto1 = new Foto() {
            @Override
            public void tirarFoto() {
                System.out.println("Tirando foto");
            }
        };

        foto1.tirarFoto();

        //Utilizando lambda expression
        Foto foto2 = () -> System.out.println("Tirando outra foto");

        foto2.tirarFoto();

        //implementando método default
        foto2.desenhar();

    }
}

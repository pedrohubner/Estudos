package com.semanatres;

public interface Math {

    default public void soma(){
        int a = 1;
        int b = 1;

        int soma = a + b;

        System.out.println(soma);
    }

    public void divisao();

}

package com.semanatres.featuresoito;

public interface OpBasicas {

    //Método default
    default public int soma(){
        int a = 87;
        int b = 55;

        int soma = a + b;

        System.out.println("\nSoma de 87 + 55 = " + soma);
        return soma;
    }

    //único método abstrato dessa interface funcional
    public void subtrai ();

}

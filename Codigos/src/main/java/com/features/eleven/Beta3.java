package com.features.eleven;

public class Beta3 {
    public static void main(String[] args) {

        String endereco = " Casmurro ";

        if (endereco.isBlank()) {
            System.out.println("String está vazia");
        }
        System.out.println("String tem corpo");

        System.out.print("\nDom");
        System.out.print(endereco.strip());
        System.out.println("55");

        System.out.print("\nDom");
        System.out.print(endereco.stripTrailing());
        System.out.println("55");

        System.out.print("\nDom");
        System.out.print(endereco.stripLeading());
        System.out.println("55");
    }
}

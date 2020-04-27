package com.semanadois.excecoes;

import java.util.Scanner;

public class JavaTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Teste com Try e Catch: ");

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        try {
            System.out.println("A divisão entre eles é: " + num1 / num2);
        }catch (ArithmeticException e){
            System.out.println("Não foi possível efetuar divisão!");
        }
    }
}
